package com.hdfc.loans.carloans;

public class FirstClass 
{
	float a=10.10f,b=20.20f,c;  // properties
	
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is :" + c);
		
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("substraction of A & B is :" + c );
		
	}

	public static void main(String[] args) 
	{
		FirstClass obj=new FirstClass();
		obj.add();
		obj.sub();
		
		FirstClass obj1=new FirstClass();
		obj1.add();
		obj1.sub();

	}

}
