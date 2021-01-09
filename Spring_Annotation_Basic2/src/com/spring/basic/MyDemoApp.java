package com.spring.basic;
import org.springframework.stereotype.Component;
//meta information for the container that please create an obj for this perticular object
@Component
//MyDemoApp myDemoApp=new MyDemoApp();
public class MyDemoApp 
{
public	MyDemoApp()
{
	System.out.println("--MyDemoApp obj created---");
}

}
