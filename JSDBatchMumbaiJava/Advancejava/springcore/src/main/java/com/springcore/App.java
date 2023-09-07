package com.springcore;

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
        System.out.println( "Hello World!" );
        ApplicationContext Context = new ClassPathXmlApplicationContext("config.xml");
        Student Student1 = (Student) Context.getBean("Student1");
        System.out.println(Student1);
    }
}
