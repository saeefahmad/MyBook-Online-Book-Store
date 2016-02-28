package com.mybook.server;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="book")
@XmlAccessorType()
public class XmlParser {

	String title;
	int item;
	int available;
	int cost;
	String topic;

	public String getTitle() {
		return title;
	}

	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTopic() {
		return topic;
	}

	@XmlElement
	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getItem() {
		return item;
	}

	@XmlElement
	public void setItem(int item) {
		this.item = item;
	}

	public int getAvailable() {
		return available;
	}

	@XmlElement
	public void setAvailable(int available) {
		this.available = available;
	}
	
	public int getCost() {
		return cost;
	}

	@XmlElement
	public void setCost(int cost) {
		this.cost = cost;
	}

}