package com.icici.loans.carloans;

public class SecondClass 
{
	int a=10,b=20,c; // properties
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is :" + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Substraction of A & B is :" + c);
	}
	
	
	public static void main(String[] args) 
	{
		SecondClass obj=new SecondClass();
		obj.add();
		obj.sub();
		
		SecondClass obj1=new SecondClass();
		obj1.add();
		obj1.sub();
	}

}
