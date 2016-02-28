package com.mybook.client;

import com.mybook.server.*;

import java.rmi.*;
import java.rmi.server.*;
import java.util.Random;
import java.util.Scanner;
public class MyBookClient{
	private String topic;
	
	public static void main (String[] argv) {
		try {
			int SrvArr[] = {1, 2, 3};
			int rand = SrvArr[new Random().nextInt(SrvArr.length)];
			com.mybook.server.FrontInterface mybook = (com.mybook.server.FrontInterface) Naming.lookup ("rmi://localhost/server" + rand);
			Scanner scanner = new Scanner(System.in);
		    System.out.println("Select Option:");
			System.out.println("[1] Search by topic");			
			System.out.println("[2] Lookup by Item Number");
			System.out.println("[3] Order by Item Number");
			System.out.println("[4] Search by title (or keyword)");
			System.out.println("[5] Query how many requests on each service");
			System.out.println("[6] Query number of books sold");
			System.out.println("[7] Query failed orders");
			System.out.println("[8] Get report of average performance");
			System.out.println("-------------------------");
			System.out.print("Enter the Option: ");
			String option = scanner.nextLine();
			System.out.println();
			
			if(option.equals("1")) {
				System.out.println("Enter topic name / title:  ");
				String optionTopic = scanner.nextLine();
				System.out.println();
				System.out.println(mybook.searchByTopic(optionTopic));
			} else if(option.equals("2")) {
				System.out.println("Enter item number:  ");
				int optionItemNumber = Integer.parseInt(scanner.nextLine());
				System.out.println();
				System.out.println(mybook.findByItemNumber(optionItemNumber));
			} else if(option.equals("3")) {
				System.out.println("Enter item number to order:  ");
				int optionItemNumberToOrder = Integer.parseInt(scanner.nextLine());
				System.out.println();
				System.out.println(mybook.orderByItemNumber(optionItemNumberToOrder));
			} else if(option.equals("4")) {
				System.out.println("Enter topic name / title:  ");
				String optionTitle = scanner.nextLine();
				System.out.println();
				System.out.println(mybook.searchByTitle(optionTitle));
			} else if(option.equals("5")) {
				System.out.println("Select Services:");
				System.out.println("[1] Search");
				System.out.println("[2] Lookup");
				System.out.println("[3] Buy");
				System.out.println("-------------------------");
				int optionServiceNumber = Integer.parseInt(scanner.nextLine());
				System.out.println();
				System.out.println("-------------------------");
				System.out.println(mybook.reportRequestsNumber(optionServiceNumber));
				System.out.println("-------------------------");
			} else if(option.equals("6")) {
				System.out.println("-------------------------");
				System.out.println(mybook.reportGoodOrders());
				System.out.println("-------------------------");
			} else if(option.equals("7")) {
				System.out.println("-------------------------");
				System.out.println(mybook.reportFailedOrders());
				System.out.println("-------------------------");
			} else if(option.equals("8")) {
				System.out.println("Select Services:");
				System.out.println("[1] Search");
				System.out.println("[2] Lookup");
				System.out.println("[3] Buy/order");
				System.out.println("-------------------------");
				int optionServiceNumber = Integer.parseInt(scanner.nextLine());
				System.out.println();
				System.out.println("-------------------------");
				System.out.println(mybook.reportServicePerformance(optionServiceNumber));
				System.out.println("-------------------------");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println ("HelloClient exception: " + e);
		}
	}
}