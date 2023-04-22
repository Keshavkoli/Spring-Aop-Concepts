package com.aopconcept;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopconceptApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		System.out.println(context);
		PaymentService paymentObject = context.getBean("Payment", PaymentService.class);
		paymentObject.makePayment(112);

		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("com/aopconcept/Config.xml");
	}

}

// added the dependency of springcore,springcontext from maven repository
// to use the AOP we need to add the dependencies of springaop,aspectjrt,aspectweaver 