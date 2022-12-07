package com.demo.mavendemo;

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
        
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
         //Dependency Injection
        //Vehicle v=(Vehicle) context.getBean("vehicle");
        //v.drive();
        //Annotation 
        //Vehicle v=(Vehicle) context.getBean("bike");
        //v.drive();
        
        //Tyre object with xml based
        Tyre t=(Tyre) context.getBean("tyre");
        System.out.println(t);
        
        //Autowired Annotation
        Car c=(Car) context.getBean("car");
          c.drive();
    }
}
