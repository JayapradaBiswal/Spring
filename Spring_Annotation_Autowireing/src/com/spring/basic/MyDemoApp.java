package com.spring.basic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//meta information for the container that please create an obj for this perticular object
@Component
//MyDemoApp myDemoApp=new MyDemoApp();
public class MyDemoApp 
{
	@Autowired
	MySqlDatabaseDao dao;
	
	public void saveObject()
	{
		dao.saveObject();
	}
	
}
