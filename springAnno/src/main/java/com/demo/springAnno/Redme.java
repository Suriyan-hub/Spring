package com.demo.springAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//non qualified and de capitalized
public class Redme {
	
	@Autowired
	
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octal Core,4GB ram,12MP Camera");
		AppConfig.setUp();
		cpu.process();
	}

}
