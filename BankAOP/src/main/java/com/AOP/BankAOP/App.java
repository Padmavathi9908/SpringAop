package com.AOP.BankAOP;

import org.springframework.aop.framework.ProxyFactoryBean;

import Services.LogAroundService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
//		System.out.println("Hello World!");
		Bank b = new Bank();
		// create advice
		LogAroundService lbs = new LogAroundService();
		// add target+advice to proxy

		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		// generate service obj

		Bank bproxy = (Bank) pfb.getObject();
		int amt = bproxy.deposite("sbi123", 50000);
		System.out.println("amt");
	}
}
