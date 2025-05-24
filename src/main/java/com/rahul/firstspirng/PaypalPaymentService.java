package com.rahul.firstspirng;

public class PaypalPaymentService implements PaymentService{
    
    @Override
    public void processPayment(double amount){
        System.out.println();
        System.out.println("Paypal");
        System.out.println("Amount "+amount+ " paid. ");
    }
}
