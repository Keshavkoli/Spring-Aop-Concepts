package com.aopconcept;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amount) {

		System.out.println(amount + "Amount Credited....");

		System.out.println(amount + "Amount Debited...");
	}

}
