package com.spring.basic;

import org.springframework.stereotype.Component;

@Component
public class MySqlDatabaseDao
{
	public	MySqlDatabaseDao()
	{
		System.out.println("--MySqlDatabaseDao obj created---");
	}
	public void saveObject()
	{
	System.out.println("Object saved using Mysql Implementation");
	}
}
