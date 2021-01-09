package com.spring.basic;

public class Mobile

{
	String name;
	String brand;
	public Mobile() 
	{
		System.out.println("Default const called");
	}
	Mobile(String name,String brand)
	{
		System.out.println("String int contsructor");
		this.name=name;
		this.brand=brand;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + "]";
	}
	

}
