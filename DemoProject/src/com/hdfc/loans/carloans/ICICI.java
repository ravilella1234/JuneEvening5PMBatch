package com.hdfc.loans.carloans;

public class ICICI implements Rbi
{

	public static void main(String[] args) 
	{
		ICICI i=new ICICI();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("iam overridden withdrawl in ICICI");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("iam overridden deposit in ICICI");
		
	}

}
