package com.wagonpool.application;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import com.wagonpool.server.CalculatorResource;

public class WagonPoolApp extends Application {
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(CalculatorResource.class);
		return classes;
	}
}