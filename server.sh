cd src/
javac com/mybook/server/*.java
rmic com.mybook.server.MyBook
rmiregistry &
java com.mybook.server.MyBookServer
