package com.mybook.server;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class SearchService {
	public int matchCount = 0;	
	
	public synchronized void search(){
		try {
		    File recordFile = new File("Records.xml");
		    JAXBContext jaxbContextRec = JAXBContext.newInstance(Records.class);            
		    Unmarshaller jaxbUnmarshallerRec = jaxbContextRec.createUnmarshaller();
			Records records = (Records) jaxbUnmarshallerRec.unmarshal(recordFile);
			records.incrementSearchbytopic();
		    Marshaller jaxbMarshallerRec = jaxbContextRec.createMarshaller();
		    jaxbMarshallerRec.marshal(records, recordFile);
		} catch (Exception x) {
	    	System.out.println(x.getMessage());
	    }		
	  }
}

