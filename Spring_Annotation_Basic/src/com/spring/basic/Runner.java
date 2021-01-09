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
         new ClassPathXmlApplicationContext("Spring-core.xml");//add Spring-core.xml in src folder
   System.out.println("Container Created");
   
   Person person=container.getBean("person", Person.class);
   }

}
