package com.springdemo.SpringAnno1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springdemo.SpringAnno1")
public class AppConfig {
	
  public static void setUp() {
	  System.out.println("Configuration Using ComponentScan");
  }
}
