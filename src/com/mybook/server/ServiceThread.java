package com.mybook.server;

public class ServiceThread extends Thread{

    protected SearchService search = null;
    protected LookupService lookup = null;
    protected OrderService order = null;
    protected SearchTitleService srctl = null;

    public ServiceThread(SearchService searchService){
       this.search = searchService;
    }
    
    public ServiceThread(LookupService lookupService){
        this.lookup = lookupService;
    }
    
    public ServiceThread(OrderService orderService){
        this.order = orderService;
    }
    
    public ServiceThread(SearchTitleService searchTlService){
        this.srctl = searchTlService;
    }

    public void run() {
    	if(search != null) {
    		search.search();
    	} else if(lookup != null) {
    		lookup.lookup();
    	} else if(order != null) {
    		order.order();
    	} else if(srctl != null) {
    		srctl.search();
    	}
    }
 }