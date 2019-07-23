package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IndividualLocaladdress {
	
	private String city;
	private String country;
	private String line1;
	private String line2;
	private String line3;
	private String line4;
	private String state;
	private String zip;
	
	@XmlElement(name="City")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@XmlElement(name="Country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@XmlElement(name="Line1")
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	@XmlElement(name="Line2")
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	@XmlElement(name="Line3")
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	@XmlElement(name="Line4")
	public String getLine4() {
		return line4;
	}
	public void setLine4(String line4) {
		this.line4 = line4;
	}
	@XmlElement(name="State")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@XmlElement(name="Zip")
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "IndividualLocaladdress [city=" + getCity() + ", country=" + getCountry() + ", line1=" + getLine1() + ", line2=" + getLine2()
				+ ", line3=" + getLine3() + ", line4=" + getLine4() + ", state=" + getState() + ", zip=" + getZip() + "]";
	}
	
	
	

}
