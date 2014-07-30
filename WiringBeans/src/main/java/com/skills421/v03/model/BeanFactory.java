package com.skills421.v03.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanFactory implements ApplicationContextAware
{
	private ApplicationContext applicationContext = null;
	private int count = 0;
	  
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		this.applicationContext = applicationContext;
	}

	public Person getPerson(String name)
	{
		Person person = this.applicationContext.getBean("person", Person.class);
		person.setName(name);
		count++;
		
		System.out.format("Person %d = %s\n",count,person);
		
		return person;
	}
}
