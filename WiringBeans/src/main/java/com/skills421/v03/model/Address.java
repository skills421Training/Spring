package com.skills421.v03.model;

import java.util.List;

public class Address
{
	private List<String> addressLines;
	private String town;
	private String county;
	private String postcode;

	public Address()
	{

	}

	public Address(List<String> addressLines, String town, String county, String postcode)
	{
		this.addressLines = addressLines;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
	}

	public List<String> getAddressLines()
	{
		return addressLines;
	}

	public void setAddressLines(List<String> addressLines)
	{
		this.addressLines = addressLines;
	}

	public String getTown()
	{
		return town;
	}

	public void setTown(String town)
	{
		this.town = town;
	}

	public String getCounty()
	{
		return county;
	}

	public void setCounty(String county)
	{
		this.county = county;
	}

	public String getPostcode()
	{
		return postcode;
	}

	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder("Address[");

		if (addressLines != null)
		{
			sb.append("addreslines=[");

			int count = 0;

			for (String line : addressLines)
			{
				if (count > 0)
					sb.append(", ");
				sb.append(line);
				count++;
			}

			sb.append("]");
		}

		sb.append(", town=" + town);
		sb.append(", county=" + county);
		sb.append(", postcode=" + postcode);
		sb.append("]");

		return sb.toString();
	}
}
