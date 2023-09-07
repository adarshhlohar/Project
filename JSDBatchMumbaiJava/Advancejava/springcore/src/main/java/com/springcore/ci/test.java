package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person Ad = (Person) context.getBean("Person1");
		System.out.println(Ad);
		
		Addition c = (Addition) context.getBean("add");
		System.out.println(c);
	}

}
