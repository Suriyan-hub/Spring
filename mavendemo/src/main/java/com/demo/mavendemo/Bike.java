package com.demo.mavendemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive() {
		System.out.println("Bike Riding....");
	}
}
