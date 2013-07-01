package com.wagonpool.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trip")
public class Trip {
	private Float mpg;
	private Float ppg;
	private Float miles;
	private Integer riderCount;
	

	public void setMpg(String mpg_string){
		this.mpg = Float.parseFloat(mpg_string);
	}
	
	public void setPpg(String ppg_string){
		this.ppg = Float.parseFloat(ppg_string);
	}
	
	public void setMiles(String miles_string){
		this.miles = Float.parseFloat(miles_string);
	}
	
	public void setRiderCount(String riderCount_string){
		this.riderCount = Integer.parseInt(riderCount_string);
	}
	
	@XmlElement(name = "mpg")
	public String getMpg(){
		return this.mpg.toString();
	}
	
	@XmlElement(name = "ppg")
	public String getPpg(){
		return this.ppg.toString();
	}

	@XmlElement(name = "miles")
	public String getMiles(){
		return this.miles.toString();
	}
	
	@XmlElement(name = "riderCount")
	public String getRiderCount(){
		return this.riderCount.toString();
	}
}
