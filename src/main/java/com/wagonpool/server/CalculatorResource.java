package com.wagonpool.server;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.wagonpool.data.Charge;
import com.wagonpool.data.Trip;

@Path("/calculator")

public class CalculatorResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("adhoc")
    public Charge getAdHocCharge(Trip trip) {
    	Float result = (Float.parseFloat(trip.getMiles()) / Float.parseFloat(trip.getMpg()) * Float.parseFloat(trip.getPpg())) / Integer.parseInt(trip.getRiderCount());
        DecimalFormat twodigits = new DecimalFormat("#0.00");
        twodigits.setRoundingMode(RoundingMode.HALF_UP);
        
    	Charge response = new Charge();

        response.setAmount(twodigits.format(result));
        return response;
    }
}