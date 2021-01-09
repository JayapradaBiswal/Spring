package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{
	public static void main(String[] args) 
	{
		//create spring container
		//Step 1
ApplicationContext container=
         new ClassPathXmlApplicationContext("context.xml");
   System.out.println("Container Created");
 //  Student s=container.getBean("ram", Student.class);
 // System.out.println(s);
   
   Mobile m=container.getBean("m1", Mobile.class);
 System.out.println(m);
	}

}
