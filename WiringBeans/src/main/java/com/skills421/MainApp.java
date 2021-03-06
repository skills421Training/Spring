package com.skills421;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skills421.model.Person;

public class MainApp
{
	public static void main(String[] args)
	{
		//
		// -- Try with resources will auto-close and release any open resources
		//
		try
		(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-config.xml"))
		{
			Person jonDoe = (Person) context.getBean("jonDoe");

			System.out.println(jonDoe);
		}
	}
}
