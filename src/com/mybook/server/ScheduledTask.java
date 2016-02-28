package com.mybook.server;
import java.rmi.Naming;
import java.util.TimerTask;
import java.util.Date;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.io.*;
import java.rmi.server.*;
import java.security.Timestamp;

public class ScheduledTask extends TimerTask {

	public void run() {
		try {
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
	catch(Exception error)
	{
		System.out.println ("Scheduler failed: " + error);
	}
	}
}