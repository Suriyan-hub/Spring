package com.demo.springAnno;

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
        Redme r=factory.getBean(Redme.class);
        r.config();
        
        
    }
}
