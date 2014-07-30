package com.skills421.v02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.skills421.v02.model.Address;
import com.skills421.v02.model.AddressBook;
import com.skills421.v02.model.Person;
 
public class TestPeople
{
    private static AbstractApplicationContext context;
 
    @BeforeClass
    public static void setupAppContext()
    {
        context = new ClassPathXmlApplicationContext("spring.v02/spring-config.xml");
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
 
    @Test
    public void test2()
    {
        System.out.println("london");
        Address address = context.getBean("london",Address.class);
        System.out.println(address);
    }
 
    @Test
    public void test3()
    {
        System.out.println("janedoe");
        Person person = context.getBean("janedoe",Person.class);
        System.out.println(person);
    }
 
    @Test
    public void testAllBeans()
    {
        System.out.println("*** All Beans ***\n");
        for(String beanName : context.getBeanDefinitionNames())
        {
            System.out.println("Bean: "+beanName);
            System.out.println(context.getBean(beanName));
            System.out.println();
        }
    }
 
    @Test
    public void testAllPersonBeans()
    {
        System.out.println("*** Person Beans ***\n");
        for(String beanName : context.getBeanNamesForType(Person.class))
        {
            System.out.println("Bean: "+beanName);
            System.out.println(context.getBean(beanName));
            System.out.println();
        }
    }
 
    @Test
    public void testAllAddressBeans()
    {
        System.out.println("*** Address Beans ***\n");
        for(String beanName : context.getBeanNamesForType(Address.class))
        {
            System.out.println("Bean: "+beanName);
            System.out.println(context.getBean(beanName));
            System.out.println();
        }
    }
 
    @Test
    public void testAllAddressBookBeans()
    {
        System.out.println("*** AddressBook Beans ***\n");
        for(String beanName : context.getBeanNamesForType(AddressBook.class))
        {
            System.out.println("Bean: "+beanName);
            System.out.println(context.getBean(beanName));
            System.out.println();
        }
    }
 
    @Test
    public void testFamilyAddressBook()
    {
        System.out.println("*** Family AddressBook ***\n");
 
        // familyAddressBook - scope = prototype
        AddressBook addr1 = context.getBean("familyAddressBook", AddressBook.class);
        AddressBook addr2 = context.getBean("familyAddressBook", AddressBook.class);
 
        System.out.println(addr1);
        System.out.println(addr2);
        System.out.println(addr1==addr2);
 
        // familyAddressBook - scope = default = singleton
        addr1 = context.getBean("DoeAddressBook1", AddressBook.class);
        addr2 = context.getBean("DoeAddressBook1", AddressBook.class);
 
        System.out.println(addr1);
        System.out.println(addr2);
        System.out.println(addr1==addr2);
 
        System.out.println("*** AddressBook Beans ***\n");
        for(String beanName : context.getBeanNamesForType(AddressBook.class))
        {
            System.out.println("Bean: "+beanName);
        }
    }
}