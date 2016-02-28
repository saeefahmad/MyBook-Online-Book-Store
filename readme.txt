The Instruction to run this program as given below:
For backend server:- (for windows)
1) Open comand prompt  
2) Go to the src directory of the project 
2) Run the following command:-
	javac com\mybook\server\*.java
	rmic com.mybook.server.MyBook
	start rmiregistry
	java com.mybook.server.MyBookServer

For backend server:- (for linux)
1) Open terminal  
2) Go to the src directory of the project 
2) Run the following command:-
	javac com/mybook/server/*.java
	rmic com.mybook.server.MyBook
	rmiregistry &
	java com.mybook.server.MyBookServer

For frontend server 2:- (for windows)
1) Open comand prompt  
2) Go to the src directory of the project 
2) Run the following command:-
	javac com\mybook\server\*.java
	rmic com.mybook.server.MyBookFront
	start rmiregistry
	java com.mybook.server.MyBookServersFront 2 0

For frontend server 2:- (for linux)
1) Open terminal  
2) Go to the src directory of the project 
2) Run the following command:-
	javac com/mybook/server/*.java
	rmic com.mybook.server.MyBookFront
	rmiregistry &
	java com.mybook.server.MyBookServersFront 2 0

For frontend server 3:- (for windows)
1) Open comand prompt  
2) Go to the src directory of the project 
2) Run the following command:-
	javac com\mybook\server\*.java
	rmic com.mybook.server.MyBookFront
	start rmiregistry
	java com.mybook.server.MyBookServersFront 3 0

For frontend server 3:- (for linux)
1) Open terminal  
2) Go to the src directory of the project 
2) Run the following command:-
	javac com/mybook/server/*.java
	rmic com.mybook.server.MyBookFront
	rmiregistry &
	java com.mybook.server.MyBookServersFront 3 0

For frontend server 1 (LEADER SERVER):- (for windows) // Start this server at the last
1) Open comand prompt  
2) Go to the src directory of the project 
2) Run the following command:-
	javac com\mybook\server\*.java
	rmic com.mybook.server.MyBookFront
	start rmiregistry
	java com.mybook.server.MyBookServersFront 1 1

For frontend server 1 (LEADER SERVER):- (for linux)
1) Open terminal  
2) Go to the src directory of the project 
2) Run the following command:-
	javac com/mybook/server/*.java
	rmic com.mybook.server.MyBookFront
	rmiregistry &
	java com.mybook.server.MyBookServersFront 1 1

For Client:-(for windows)
1) Open command prompt
2) Go to the src directory of the project 
3) Run the following command:
	javac com\mybook\client\*.java
	java com.mybook.client.MyBookClient

For Client:-(for linux)
1) Open terminal
2) Go to the src directory of the project 
3) Run the following command:
	javac com/mybook/client/*.java
	java com.mybook.client.MyBookClient
