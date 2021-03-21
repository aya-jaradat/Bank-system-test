package testJUnit;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String name;
	private int Age;
	private String phone;
	public List<Account> list = new ArrayList<Account>();
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String n)
	{
		String n1=n;
		n = n.toLowerCase();
		boolean flag=true;
		for (int i=0;i<n.length();i++)		{
			
			if ((n.charAt(i) >='a' && n.charAt(i) <='z') || n.charAt(i) == ' ')
				continue;
			else
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
		 this.name=n1;
		
		else
			System.out.println(n+" : incorrect name !!");
	}
	
	public int getAge()
	{
		return this.Age;
	}
	
	public void setAge(int a)
	{
		if (a>=18)
		 this.Age=a;
		
		else
			System.out.println(a+ " : The age must at least 18 !!");
	}
	
	public String getPhone()
	{
		return this.phone;
	}
	
	public void setPhone(String p)
	{
		boolean flag=true;
		for (int i=0;i<p.length();i++)		
		{
			
			if (Character.isDigit(p.charAt(i)))
				continue;
			else
			{
				flag = false;
				break;
			}
		}
		
		if(p.length() == 10 && p.charAt(0)=='0' && flag==true)
			this.phone=p;
			
		else
			System.out.println(p +" : incorrect phone number !!");
		
	}

}
