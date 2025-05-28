package com.rahul.firstspirng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstspirngApplication {

	public static void main(String[] args) {


		SpringApplication.run(FirstspirngApplication.class, args);
		//! WE ARE GIVING CONTROL OF OBJECTS AND DEPENDENCY TO SPRING CORE(IOC)
		// ApplicationContext context = SpringApplication.run(FirstspirngApplication.class, args);  //returns an object of type application context
		
		
		// var orderService = context.getBean(OrderSerivce.class);
		// orderService.placeOrder();



		//! WE ARE MANUALLY CREATING OBJECTS AND INJECTING DEPENDENCY



		//  here we are providing the order service the payment service
		//! here we are injecting the dependency
		// var orderservice = new OrderSerivce(new StripePaymentService()); 
		// orderservice.placeOrder();


		//! this uses the paypal payment service
		//! here we are injecting the paypal dependency into orderService
		
		// var orderservicePaypal = new OrderSerivce(new PaypalPaymentService()); 
		// orderservicePaypal.placeOrder();


		//! setter injection
		//! we should use this approach  to optional dependency
		// var orderServiceNew = new OrderSerivce(); //instead of passing it to constructor we are passing it via a setter
		// orderServiceNew.setpaymentService(new PaypalPaymentService());
		// orderServiceNew.placeOrder(); 

	}

}
