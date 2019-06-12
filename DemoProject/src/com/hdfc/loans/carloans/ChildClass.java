package com.hdfc.loans.carloans;

public class ChildClass extends FirstAbstarct
{

	public static void main(String[] args) 
	{
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();

	}
	
	public void m1()
	{
		System.out.println("iam overridden m1 concrete method in childClass");
	}
	

	@Override
	public void m2() 
	{
		System.out.println("iam overriden m2 in ChildClass");
	}

}
