package com.wagonpool.data.test;
import static org.junit.Assert.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.junit.Test;

import com.wagonpool.data.Charge;
import com.wagonpool.data.Trip;
import com.wagonpool.server.CalculatorResource;

public class DecimalFormatTest {

	@Test
	public void test() {
		 DecimalFormat twodigits = new DecimalFormat("#0.00");
		 twodigits.setRoundingMode(RoundingMode.HALF_UP);
		 
		 String sres = twodigits.format(4.0);
		 System.out.println(sres);
		 assertEquals("4.00", sres);
	}
	
	@Test
	public void test2() {
		CalculatorResource cr = new CalculatorResource();
		
		Trip tt = new Trip();
		tt.setMiles("40");
		tt.setMpg("40");
		tt.setPpg("4");
		tt.setRiderCount("1");
		
		Charge cc = cr.getAdHocCharge(tt);
		
		System.out.println(cc.getAmount());
		
		assertEquals("4.00", cc.getAmount());
	}

}
