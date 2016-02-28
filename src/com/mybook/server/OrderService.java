package com.mybook.server;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class OrderService {
	BookList list = null;
	public OrderService(BookList booklist) {
		this.list = booklist;
	}
	public synchronized void order(){
		try {
			File file = new File("Books.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(BookList.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.marshal(this.list, file);
            
            File recordFile = new File("Records.xml");
            JAXBContext jaxbContextRec = JAXBContext.newInstance(Records.class);            
            Unmarshaller jaxbUnmarshallerRec = jaxbContextRec.createUnmarshaller();
			Records records = (Records) jaxbUnmarshallerRec.unmarshal(recordFile);
			records.incrementOrdered();
            Marshaller jaxbMarshallerRec = jaxbContextRec.createMarshaller();
            jaxbMarshallerRec.marshal(records, recordFile);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }		
	  }

}

