package com.springdemo.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Dependency Injection
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle v=(Vehicle) context.getBean("vehicle");
    	//Vehicle v1=context.getBean("vehicle", Car.class);
    	v.drive();
    	//Annotation Configuration
    	Vehicle v1=(Vehicle) context.getBean("bike");
    	v1.drive();
    	
    	
    	
    }
}
