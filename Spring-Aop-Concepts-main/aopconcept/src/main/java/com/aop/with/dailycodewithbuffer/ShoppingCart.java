package com.aop.with.dailycodewithbuffer;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	// logging
	// Authentication & Authorization
	// Sanitize the data
	public void checkout() {
		System.out.println("check out method from shopping cart");
	}

	// here we check the number for parameters for the @Before and @After
	public void possible(String status) {
		System.out.println("check inside the possible method");
	}
	public int quantity() {
		return 2;
	}
}
