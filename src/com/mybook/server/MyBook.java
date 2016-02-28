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


public class MyBook extends UnicastRemoteObject implements MyBookInterface {
	private Scanner scanner;
	private String message = null;
	private String topic;
	private MyBookInterface server;
	private long timerSearchSrvice = 0;
	private long timerLookuphSrvice = 0;
	private long timerOrderSrvice = 0;	
	private long timerSearchTlSrvice = 0; 
	private long timeOffset;
	
	public MyBook() throws RemoteException {
		this.timeOffset = 0;
	}
	
	public String say( ) throws RemoteException {
		return message; 
	}
	
	//findByItemNumber
	public String findByItemNumber(int item) throws RemoteException {
		long beginTime = System.currentTimeMillis();
		int itemNumber = item; 
		int matchCount = 0;
		String ret = "";
        try {
            BookList bookList = this.parse();
            for (int i = 0; i < bookList.bookList.size(); i++) {
            	if(bookList.bookList.get(i).getItem() == itemNumber) {
            		matchCount++;
            		ret += "Title: "+bookList.bookList.get(i).getTitle()+"  ||  "+
            	            "Item Number: "+bookList.bookList.get(i).getItem()+"  ||  "+
            				 "Cost: "+bookList.bookList.get(i).getCost()+"  ||  "+
                    	            "Available: "+bookList.bookList.get(i).getAvailable()+"\n";
            	}
            }
            
            ret += "*** Total match found: "+matchCount+" ***\n";   

            LookupService lookupSrv = new LookupService();
            Thread  threadLookup = new ServiceThread(lookupSrv);
            threadLookup.start();
        } catch (Exception x) {
        	System.out.println(x.getMessage());
        }		
        long endTime = System.currentTimeMillis();
    	long difference = endTime - beginTime;
    	this.setTimerLookupSrvice(difference);
    	ret += "Processing time: "+difference+"ms\n";
    	return ret;
	}
	
	//searchByTopic
	public String searchByTopic(String words) throws RemoteException {
		long beginTime = System.currentTimeMillis();
		String topic = words; 
		int matchCount = 0;
		String ret = "";
        try {
            BookList bookList = this.parse();
            for (int i = 0; i < bookList.bookList.size(); i++) {
            	if(bookList.bookList.get(i).getTopic().toLowerCase().equals(topic.toLowerCase())) {
            		matchCount++;
            		ret+= "Title: "+bookList.bookList.get(i).getTitle()+"  ||  "+
            	            "Item Number: "+bookList.bookList.get(i).getItem()+"  ||  "+
           			     	 "Cost: "+bookList.bookList.get(i).getCost()+"  ||  "+
                    	            "Available: "+bookList.bookList.get(i).getAvailable()+"\n";
            	}
            }
                
            ret+= "*** Total match found: "+matchCount+" ***\n";
            SearchService searchSrv = new SearchService();
            Thread  threadSearch = new ServiceThread(searchSrv);
            threadSearch.start();
        } catch (Exception x) {
        	System.out.println(x.getMessage());
        }		
        long endTime = System.currentTimeMillis();
    	long difference = endTime - beginTime;
    	this.setTimerSearchSrvice(difference);
    	ret += "Processing time: "+difference+"ms\n";
    	return ret;
	}
	
	//searchByTitle
	public String searchByTitle(String words) throws RemoteException {
		long beginTime = System.currentTimeMillis();
		String title = words; 
		int matchCount = 0;
		String ret = "";
        try {
            BookList bookList = this.parse();
            for (int i = 0; i < bookList.bookList.size(); i++) {
            	if(bookList.bookList.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
            		matchCount++;
            		ret+= "Title: "+bookList.bookList.get(i).getTitle()+"  ||  "+
            	            "Item Number: "+bookList.bookList.get(i).getItem()+"  ||  "+
           			     	 "Cost: "+bookList.bookList.get(i).getCost()+"  ||  "+
                    	            "Available: "+bookList.bookList.get(i).getAvailable()+"\n";
            	}
            }
                
            ret+= "*** Total match found: "+matchCount+" ***\n";
            SearchTitleService searchTlSrv = new SearchTitleService();
            Thread  threadSearch = new ServiceThread(searchTlSrv);
            threadSearch.start();
        } catch (Exception x) {
        	System.out.println(x.getMessage());
        }		
        long endTime = System.currentTimeMillis();
    	long difference = endTime - beginTime;
    	this.setTimerSearchTlSrvice(difference);
    	ret += "Processing time: "+difference+"ms\n";
    	return ret;
	}
	
	//orderByItemNumber
	public String orderByItemNumber(int item) throws RemoteException {
		long beginTime = System.currentTimeMillis();
		int itemNumber = item; 
		String ret = "";
        try {
            BookList bookList = this.parse();
            for (int i = 0; i < bookList.bookList.size(); i++) {
            	if(bookList.bookList.get(i).getItem() == itemNumber) {
            		bookList.bookList.get(i).setAvailable(bookList.bookList.get(i).getAvailable() - 1);
            		ret += "Book Ordered successfully! \n";
            		ret += "Title: "+bookList.bookList.get(i).getTitle()+"  ||  "+
            	            "Item Number: "+bookList.bookList.get(i).getItem()+"  ||  "+
           				     "Cost: "+bookList.bookList.get(i).getCost()+"  ||  "+
                    	            "Available: "+bookList.bookList.get(i).getAvailable()+"\n";
            	}
            }
            OrderService orderSrv = new OrderService(bookList);
            Thread  threadOrder = new ServiceThread(orderSrv);
            threadOrder.start();
            
        } catch (Exception x) {
        	System.out.println(x.getMessage());
        }		
        long endTime = System.currentTimeMillis();
    	long difference = endTime - beginTime;
    	this.setTimerOrderSrvice(difference);
    	ret += "Processing time: "+difference+"ms\n";
    	return ret;
	}
	

	public BookList parse() {
		BookList bookList = null;
		try {

			File file = new File("Books.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(BookList.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			bookList = (BookList) jaxbUnmarshaller.unmarshal(file);
			return bookList;

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
		return bookList; 
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
		Records records = null;
		try {
			File recordFile = new File("Records.xml");
		    JAXBContext jaxbContextRec = JAXBContext.newInstance(Records.class);            
		    Unmarshaller jaxbUnmarshallerRec = jaxbContextRec.createUnmarshaller();
			records = (Records) jaxbUnmarshallerRec.unmarshal(recordFile);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }
		switch(serviceNumber) {
		case 1:
			value = records.getSearchbytopic();
			break;
		case 2:
			value = records.getFindbyitemnumber();
			break;
		case 3:
			value = records.getOrdered()+records.getFailedorder();
			break;
		default:
			break;
		}
		return value;
	}
	
	/*
	 * Tell users how many books have been sold successfully starting from the beginning
	 */
	public int reportGoodOrders() throws RemoteException {
		int value = 0;
		Records records = null;
		try {
			File recordFile = new File("Records.xml");
		    JAXBContext jaxbContextRec = JAXBContext.newInstance(Records.class);            
		    Unmarshaller jaxbUnmarshallerRec = jaxbContextRec.createUnmarshaller();
			records = (Records) jaxbUnmarshallerRec.unmarshal(recordFile);
			value = records.getOrdered();
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
		Records records = null;
		try {
			File recordFile = new File("Records.xml");
		    JAXBContext jaxbContextRec = JAXBContext.newInstance(Records.class);            
		    Unmarshaller jaxbUnmarshallerRec = jaxbContextRec.createUnmarshaller();
			records = (Records) jaxbUnmarshallerRec.unmarshal(recordFile);
			value = records.getFailedorder();
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
		Records records = null;
		try {
			File recordFile = new File("Records.xml");
		    JAXBContext jaxbContextRec = JAXBContext.newInstance(Records.class);            
		    Unmarshaller jaxbUnmarshallerRec = jaxbContextRec.createUnmarshaller();
			records = (Records) jaxbUnmarshallerRec.unmarshal(recordFile);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }
		switch(serviceNumber) {
		case 1:
			value = this.getTimerSearchSrvice() / records.getSearchbytopic();
			break;
		case 2:
			value = this.getTimerLookupSrvice() / records.getFindbyitemnumber();
			break;
		case 3:
			value = this.getTimerOrderSrvice() / (records.getOrdered()+records.getFailedorder());
			break;
		default:
			break;
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