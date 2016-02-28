package com.mybook.server;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="record")
@XmlAccessorType()
public class Records {

	int searchbytopic;
	int findbyitemnumber;
	int ordered;
	int failedorder;
	int searchbytitle; 

	public int getSearchbytopic() {
		return searchbytopic;
	}

	@XmlElement
	public void setSearchbytopic(int searchbytopic) {
		this.searchbytopic = searchbytopic;
	}
	
	public void incrementSearchbytopic() {
		this.searchbytopic++;
	}
	
	public int getSearchbytitle() {
		return searchbytitle;
	}

	@XmlElement
	public void setSearchbytitle(int searchbytitle) {
		this.searchbytitle = searchbytitle;
	}
	
	public void incrementSearchbytitle() {
		this.searchbytitle++;
	}

	public int getFindbyitemnumber() {
		return findbyitemnumber;
	}

	@XmlElement
	public void setFindbyitemnumber(int findbyitemnumber) {
		this.findbyitemnumber = findbyitemnumber;
	}

	public void incrementFindbyitemnumber() {
		this.findbyitemnumber++;
	}

	public int getOrdered() {
		return ordered;
	}

	@XmlElement
	public void setOrdered(int ordered) {
		this.ordered = ordered;
	}
	
	public void incrementOrdered() {
		this.ordered++;
	}
	
	public int getFailedorder() {
		return failedorder;
	}

	@XmlElement
	public void setFailedorder(int failedorder) {
		this.failedorder = failedorder;
	}
	
	public void incrementFailedorder() {
		this.failedorder++;
	}
}