package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class ExtendedReply {
	
	private String MessagesArray;
	
	@XmlElement
	public String getMessagesArray() {
		return MessagesArray;
	}
	
	
	public void setMessagesArray(String messagesArray) {
		MessagesArray = messagesArray;
	}

	@Override
	public String toString() {
		return "ExtendedReply [MessagesArray=" + getMessagesArray() + "]";
	}
	
	
	
	

}
