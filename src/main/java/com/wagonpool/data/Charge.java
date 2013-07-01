package com.wagonpool.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "charge")
public class Charge {

	private String amount;
	
	@XmlElement(name = "amount")
	public String getAmount(){
		return this.amount;
	}
	
	public void setAmount(String amount_string){
		this.amount = amount_string;
	}
	
	
	
	
}
