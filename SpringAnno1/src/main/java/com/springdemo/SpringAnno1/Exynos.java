package com.springdemo.SpringAnno1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Exynos implements MobileProcessor {

	public void process() {
		System.out.println("2nd Bst Processor");
	}

}
