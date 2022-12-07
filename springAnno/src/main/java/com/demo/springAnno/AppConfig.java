package com.demo.springAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.demo.springAnno")
public class AppConfig {
 
	
	  @Bean public Redme getphone() { return new Redme(); }
	  
	  @Bean public MobileProcessor getProcess() { return new HTC(); }
	 
	  public static void setUp() {
		  System.out.println("Bean Configuration");
	  }
	 
}
