package com.skills421.v03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skills421.v03.model.Person;
import com.skills421.v03.model.BeanFactory;
 
public class TestPeople
{
    private static AbstractApplicationContext context;
 
    @BeforeClass
    public static void setupAppContext()
    {
        context = new ClassPathXmlApplicationContext("spring.v03/spring-config.xml");
    }
 
    @AfterClass
    public static void closeAppContext()
    {
        if(context!=null)
        {
            context.close();
        }
    }
 
    @After
    public void printBlankLine()
    {
        System.out.println();
    }
 
    @Test
    public void test1()
    {
        System.out.println("person");
        Person person = context.getBean("person",Person.class);
        System.out.println(person);
    }
    
    @Test
    public void test2()
    {
        System.out.println("bean factory");
        BeanFactory beanFactory = context.getBean("beanfactory",BeanFactory.class);
        
        Person jane = beanFactory.getPerson("Jane Doe");
        System.out.println(jane);
        
        Person jon = beanFactory.getPerson("Jon Doe");
        System.out.println(jon);
        
        Person mark = beanFactory.getPerson("Mark Doe");
        System.out.println(mark);
    }
 
}