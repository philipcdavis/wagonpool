package com.wagonpool.data.test;

import static org.junit.Assert.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import com.wagonpool.data.Trip;

public class TripTests {

	@Test
	public void test() {
		
		// Create a Charge object
		Trip test = new Trip();
		test.setMpg("30");
		test.setPpg("3.50");
		test.setMiles("40");
		test.setRiderCount("2");
		
	    // create JAXB context and instantiate marshaller
	    JAXBContext context;
		try {
			context = JAXBContext.newInstance(Trip.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(test, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Caught exception, failing test");
		}
	   
	}

}
