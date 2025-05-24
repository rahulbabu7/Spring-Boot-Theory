package com.rahul.firstspirng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstspirngApplication {

	public static void main(String[] args) {
		// SpringApplication.run(FirstspirngApplication.class, args);
		

		//  here we are providing the order service the payment service
		//! here we are injecting the dependency
		var orderservice = new OrderSerivce(new StripePaymentService()); 
		orderservice.placeOrder();


		//! this uses the paypal payment service
		//! here we are injecting the paypal dependency into orderService
		
		var orderservicePaypal = new OrderSerivce(new PaypalPaymentService()); 
		orderservicePaypal.placeOrder();

	}

}
