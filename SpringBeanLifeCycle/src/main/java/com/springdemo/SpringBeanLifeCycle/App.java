package com.springdemo.SpringBeanLifeCycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
       UserDAO dao=context.getBean("userDAO",UserDAO.class);
       dao.selectUsers();
       //((ClassPathXmlApplicationContext)context).close();
       ((ClassPathXmlApplicationContext)context).registerShutdownHook();//another to close object.It will execute once the main thread ends
       //UserDAO dao1=context.getBean("userDAO",UserDAO.class);
    }
}
