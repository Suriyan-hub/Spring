package com.demo.springAnno;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("Best CPU");
	}

}
