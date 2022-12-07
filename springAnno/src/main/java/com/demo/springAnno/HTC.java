package com.demo.springAnno;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class HTC implements MobileProcessor {

	public void process() {
		System.out.println("2nd Best CPU");

	}

}
