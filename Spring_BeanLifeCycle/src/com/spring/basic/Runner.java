package com.spring.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{
	public static void main(String[] args) 
	{
		//create spring container
		//Step 1
		  System.out.println("Container Created");
AbstractApplicationContext container=
         new ClassPathXmlApplicationContext("Spring-core.xml");//add Spring-core.xml in src folder
   
   Human ram=container.getBean( Human.class);
   
   System.out.println("Container is being destroyed");
   container.close();
   System.out.println("Container is destroyed");
   
	}
	

}
