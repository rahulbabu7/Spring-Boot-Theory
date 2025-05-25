package com.rahul.firstspirng;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService{
    
    @Override
    public void processPayment(double amount){
        System.out.println();
        System.out.println("Paypal");
        System.out.println("Amount "+amount+ " paid. ");
    }
}
