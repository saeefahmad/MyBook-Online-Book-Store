cd src\
javac com\mybook\server\*.java
rmic com.mybook.server.MyBook
start rmiregistry
java com.mybook.server.MyBookServer
