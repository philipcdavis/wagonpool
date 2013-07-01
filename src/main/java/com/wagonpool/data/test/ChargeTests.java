package com.wagonpool.data.test;

import static org.junit.Assert.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import com.wagonpool.data.Charge;

public class ChargeTests {

	@Test
	public void test() {
		
		// Create a Charge object
		Charge test_charge = new Charge();
		test_charge.setAmount("5.00");
		
	    // create JAXB context and instantiate marshaller
	    JAXBContext context;
		try {
			context = JAXBContext.newInstance(Charge.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(test_charge, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Caught exception, failing test");
		}
	   
	}

}
