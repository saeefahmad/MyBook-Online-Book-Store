package com.mybook.server;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "books")
public class BookList {
	@XmlElement(name = "book")
	public List<XmlParser> bookList = null;
	 
	/*
	 * Constructor
	 */
	public BookList()
	{
		bookList = new ArrayList<XmlParser>();
	}

}
