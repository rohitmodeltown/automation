package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class superContext {
	
	private String primaryPassword;
	private String userId;
	
	@XmlElement(name="PrimaryPassword")
	public String getPrimaryPassword() {
		return primaryPassword;
	}
	
	public void setPrimaryPassword(String primaryPassword) {
		this.primaryPassword = primaryPassword;
	}
	@XmlElement(name="UserId")
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "superContext [primaryPassword=" + getPrimaryPassword() + ", userId=" + getUserId() + "]";
	}
	
	

}
