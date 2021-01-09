package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
public static void main(String[] args) {
	ApplicationContext container=
	         new ClassPathXmlApplicationContext("context.xml");
	   System.out.println("Container Created");
	   
	   Water bisleri=container.getBean("bisleri", Water.class);
	   System.out.println(bisleri);
	   System.out.println("--------------");
	   Fish shark=container.getBean("shark", Fish.class);
	   System.out.println(shark);
	   
}
}
