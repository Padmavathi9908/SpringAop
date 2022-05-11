package com.AOP.BankAOP;

public class Bank 
{
	private int amt=5000;
	private String acno="sbi123";
	
	public int deposite(String acno,int amt) throws Exception
	{
		if(acno.equals(this.acno))
		{
			System.out.println("Deposite method");			
			this.amt=this.amt+amt;
			return this.amt;
		}
		else
		{
		throw new AcnoNotFoundException();
		}
	}

}
