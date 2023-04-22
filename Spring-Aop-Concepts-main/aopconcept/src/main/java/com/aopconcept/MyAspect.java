package com.aopconcept;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.aopconcept.service.PaymentServiceImpl.makePayment(..))")
	public void printBefore() {
		System.out.println("Payment Started..");
	}

	@After("execution(* com.aopconcept.service.PaymentServiceImpl.makePayment(..))")
	public void printAfter() {
		System.out.println("Payment Successfull..");
	}
}
