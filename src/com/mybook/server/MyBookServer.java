package com.mybook.server;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;


public class MyBookServer {
	
	/**
	 * Activates the server
	 * @param args arguments
	 */
	public static void main(String[] args)
	{
		// grant all security passes for this program
		System.setProperty("java.security.policy", "policy.all");
		
		try
		{
			@SuppressWarnings("unused")
			MyBook mybook = new MyBook();
			Naming.rebind ("rmi://localhost/mybook", mybook); 
			System.out.println ("Server is ready.");
			
		}
		catch(Exception error)
		{
			System.out.println ("Hello Server failed: " + error);
		}
	}
	
	
}

