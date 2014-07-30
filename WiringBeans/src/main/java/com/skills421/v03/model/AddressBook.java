package com.skills421.v03.model;

import java.util.List;

import com.skills421.v02.model.Person;

public class AddressBook
{
	private Address home;
	private List<Person> contacts;

	public Address getHome()
	{
		return home;
	}

	public void setHome(Address home)
	{
		this.home = home;
	}

	public List<Person> getContacts()
	{
		return contacts;
	}

	public void setContacts(List<Person> contacts)
	{
		this.contacts = contacts;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder("AddressBook[");

		sb.append("home=" + home);

		if (contacts != null)
		{
			int count = 0;

			for (Person person : contacts)
			{
				if (count > 0)
					sb.append(", ");
				sb.append(person);
				count++;
			}
		}

		sb.append("]");

		return sb.toString();
	}

}
