package com.spring.basic;

public class Student

{
	String name;
	int age;
	public Student() 
	{
		System.out.println("Default const called");
	}
	Student(String name,int age)
	{
		System.out.println("String int contsructor");
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	

}
