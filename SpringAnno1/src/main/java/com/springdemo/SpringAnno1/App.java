package com.springdemo.SpringAnno1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
//Spring Core Annotations
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
        Nokia n=factory.getBean(Nokia.class);
        n.config();
    }
}
