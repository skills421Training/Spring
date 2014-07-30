package com.skills421.v02.model;

import java.util.List;

public class Person
{
	private String name;
	private int age;
	private String email;

	private Address address;

	private List<Address> previousAddresses;

	public Person()
	{

	}

	public Person(String name, int age, String email, Address address)
	{
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public List<Address> getPreviousAddresses()
	{
		return previousAddresses;
	}

	public void setPreviousAddresses(List<Address> previousAddresses)
	{
		this.previousAddresses = previousAddresses;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder("Person[");

		sb.append("name=" + name);
		sb.append(", age=" + age);
		sb.append(", email=" + email);
		sb.append(", address=" + address);

		if (previousAddresses != null)
		{
			sb.append(", previousAddresses=[");

			int count = 0;

			for (Address prevAddress : previousAddresses)
			{
				if (count > 0)
					sb.append(", ");
				sb.append(prevAddress);
				count++;
			}

			sb.append("]");
		}

		sb.append("]");

		return sb.toString();
	}

}