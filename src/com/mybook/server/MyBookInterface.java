package com.mybook.server;

import java.rmi.*;

public interface MyBookInterface extends Remote {
	public String say( ) throws RemoteException;
	public String searchByTopic(String words) throws RemoteException;
	public String findByItemNumber(int item) throws RemoteException;
	public String orderByItemNumber(int item) throws RemoteException;
	public String searchByTitle(String words) throws RemoteException;
	public int reportRequestsNumber(int serviceNumber) throws RemoteException;
	public int reportGoodOrders() throws RemoteException;
	public int reportFailedOrders() throws RemoteException;
	public long reportServicePerformance(int serviceNumber) throws RemoteException;
}