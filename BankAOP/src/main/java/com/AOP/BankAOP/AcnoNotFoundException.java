package com.AOP.BankAOP;

public class AcnoNotFoundException extends Exception
{

	@Override
	public String toString() {
		return "Acno invalid";
	}

}
