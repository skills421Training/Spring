package com.skills421.v01.model;

public class Person
{
	private String firstname;
	private String lastname;
	private int age;
	private double height;

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	@Override
	public String toString()
	{
		return String.format("Person [firstname=%s, lastname=%s, age=%s, height=%s]", firstname, lastname, age, height);
	}

}
