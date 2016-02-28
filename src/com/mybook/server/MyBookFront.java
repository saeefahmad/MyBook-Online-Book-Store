package com.mybook.server;

import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
import java.io.*;
import java.rmi.server.*;
import java.security.Timestamp;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class MyBookFront extends UnicastRemoteObject implements FrontInterface {
	private Scanner scanner;
	private String message = null;
	private String topic;
	private MyBookInterface server;
	private long timerSearchSrvice = 0;
	private long timerLookuphSrvice = 0;
	private long timerOrderSrvice = 0;	
	private long timerSearchTlSrvice = 0; 
	private long timeOffset;
	
	public MyBookFront() throws RemoteException {
		this.timeOffset = 0;
	}
	
	public String say( ) throws RemoteException {
		return message; 
	}
	
	//findByItemNumber
	public String findByItemNumber(int item) throws RemoteException {
		String ret = "";
		try {
		com.mybook.server.MyBookInterface mybook = (com.mybook.server.MyBookInterface) Naming.lookup ("rmi://localhost/mybook");
		ret = mybook.findByItemNumber(item);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }	
    	return ret;		
	}
	
	//searchByTopic
	public String searchByTopic(String words) throws RemoteException {
		String ret = "";
		try {
		com.mybook.server.MyBookInterface mybook = (com.mybook.server.MyBookInterface) Naming.lookup ("rmi://localhost/mybook");
		ret = mybook.searchByTopic(words);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }	
    	return ret;
	}
	
	//searchByTitle
	public String searchByTitle(String words) throws RemoteException {
		String ret = "";
		try {
		com.mybook.server.MyBookInterface mybook = (com.mybook.server.MyBookInterface) Naming.lookup ("rmi://localhost/mybook");
		ret = mybook.searchByTitle(words);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }
		
    	return ret;
	}
	
	//orderByItemNumber
	public String orderByItemNumber(int item) throws RemoteException {
		String ret = "";
		try {
		com.mybook.server.MyBookInterface mybook = (com.mybook.server.MyBookInterface) Naming.lookup ("rmi://localhost/mybook");
		ret = mybook.orderByItemNumber(item);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }
    	return ret;
	}
	
	public void setTimerSearchSrvice(long value) {
		this.timerSearchSrvice += value; 
	}
	public long getTimerSearchSrvice() {
		return this.timerSearchSrvice; 
	}
	public void setTimerSearchTlSrvice(long value) {
		this.timerSearchTlSrvice += value; 
	}
	public long getTimerSearchTlSrvice() {
		return this.timerSearchTlSrvice; 
	}
	public void setTimerLookupSrvice(long value) {
		this.timerLookuphSrvice += value; 
	}
	public long getTimerLookupSrvice() {
		return this.timerLookuphSrvice; 
	}
	public void setTimerOrderSrvice(long value) {
		this.timerOrderSrvice += value; 
	}
	public long getTimerOrderSrvice() {
		return this.timerOrderSrvice; 
	}
	
	/*
	 * Allows the user to query that how many requests on each service have been received
	 */
	public int reportRequestsNumber(int serviceNumber) throws RemoteException {
		int value = 0;
		try {
		com.mybook.server.MyBookInterface mybook = (com.mybook.server.MyBookInterface) Naming.lookup ("rmi://localhost/mybook");
		value = mybook.reportRequestsNumber(serviceNumber);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }
		return value;
	}
	
	/*
	 * Tell users how many books have been sold successfully starting from the beginning
	 */
	public int reportGoodOrders() throws RemoteException {
		int value = 0;
		try {
		com.mybook.server.MyBookInterface mybook = (com.mybook.server.MyBookInterface) Naming.lookup ("rmi://localhost/mybook");
		value = mybook.reportGoodOrders();
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }
	
		
		return value;
	}
	
	/*
	 * report how many orders are failed in total
	 */
	public int reportFailedOrders() throws RemoteException {
		int value = 0;
		try {
		com.mybook.server.MyBookInterface mybook = (com.mybook.server.MyBookInterface) Naming.lookup ("rmi://localhost/mybook");
		value = mybook.reportFailedOrders();
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }
		
		return value;
	}
	
	/*
	 * report the average performance for serving a request for the specific service
	 */
	public long reportServicePerformance(int serviceNumber) throws RemoteException {
		long value = 0;
		try {
		com.mybook.server.MyBookInterface mybook = (com.mybook.server.MyBookInterface) Naming.lookup ("rmi://localhost/mybook");
		value = mybook.reportServicePerformance(serviceNumber);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }		
		return value;
	}
	
	public long getTime() throws RemoteException {
		long value = 0;
		value = System.currentTimeMillis(); 
		value = value + this.timeOffset;

		return value;
	}
	
	public void setOffset(long time) throws RemoteException {
		this.timeOffset = time;
	}
	
	
	
}