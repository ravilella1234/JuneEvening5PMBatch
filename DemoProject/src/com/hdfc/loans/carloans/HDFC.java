package com.hdfc.loans.carloans;

public class HDFC implements Rbi
{

	public static void main(String[] args) 
	{
		HDFC h=new HDFC();
		h.deposit();
		h.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("iam overridden withdrawl in HDFC");
		
	}

	@Override
	public void deposit() {
		
		System.out.println("iam overridden deposit in HDFC");
	}

}
