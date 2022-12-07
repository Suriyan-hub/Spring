package com.demo.mavendemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Annotation based Configuration used @Component
public class Car implements Vehicle{
	
	@Autowired
	private Engine engine;
	
	
	
	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public void drive() {
		System.out.println("car " +engine);
	}
}
