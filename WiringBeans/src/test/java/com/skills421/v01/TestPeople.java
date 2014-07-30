package com.skills421.v01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skills421.v01.model.Person;
 
public class TestPeople
{
    private static AbstractApplicationContext context;
 
    @BeforeClass
    public static void setupAppContext()
    {
        context = new ClassPathXmlApplicationContext("spring.v01/spring-config.xml");
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
        System.out.println("jondoe");
        Person person = context.getBean("jondoe",Person.class);
        System.out.println(person);
    }
}