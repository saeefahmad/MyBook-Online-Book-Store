package com.mybook.server;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;
import java.util.Timer;


public class MyBookServersFront {
	
	/**
	 * Activates the server
	 * @param args arguments
	 */
	public static void main(String[] args)
	{
		// grant all security passes for this program
		System.setProperty("java.security.policy", "policy.all");
		if(args.length != 2) {
			//
		}
		
		try
		{			
			@SuppressWarnings("unused")
			com.mybook.server.FrontInterface mybookfront = new MyBookFront();
			Naming.rebind ("rmi://localhost/server"+args[0], mybookfront); 
			System.out.println ("Server"+ args[0] + "is ready.");
			
			if(Integer.parseInt(args[1]) == 1){
				com.mybook.server.FrontInterface server2 = (com.mybook.server.FrontInterface) Naming.lookup ("rmi://localhost/server2");
				com.mybook.server.FrontInterface server3 = (com.mybook.server.FrontInterface) Naming.lookup ("rmi://localhost/server3");
				//leader
				com.mybook.server.FrontInterface server1 = (com.mybook.server.FrontInterface) Naming.lookup ("rmi://localhost/server1");
				
				long timeServer1 = server1.getTime();
				long timeServer2 = server2.getTime();
				long timeServer3 = server3.getTime();
				long timeAverage = (timeServer1 + timeServer2 + timeServer3)/ 3; 
				long newTimeOffsetServer1 = ((timeServer2 - timeServer1) + (timeServer3 - timeServer1)) / 3;
				long newTimeServer1 = timeServer1 + newTimeOffsetServer1;
				long newTimeOffsetServer2 = (newTimeServer1 - timeServer2);
				server2.setOffset(newTimeOffsetServer2);
				long newTimeOffsetServer3 = (newTimeServer1 - timeServer3);
				server3.setOffset(newTimeOffsetServer3);				
			}			
		}
		catch(Exception error)
		{
			System.out.println ("Server failed: " + error);
		}
		Timer time = new Timer(); // Instantiate Timer Object
		ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
		time.schedule(st, 0, 1000000); // Create Repetitively task for every 1000 secs
	}

}

