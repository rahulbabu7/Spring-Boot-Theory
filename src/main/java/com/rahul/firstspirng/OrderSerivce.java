package com.rahul.firstspirng;

import org.springframework.stereotype.Component;

@Component  //using annotations for beans
public class OrderSerivce {

    private PaymentService paymentService;


    //! from the main class we are injecting a payment service
     public OrderSerivce(PaymentService paymentService){
        this.paymentService = paymentService;
    }


    public void placeOrder(){

        //!ight coupling the orderservice depends on strive
        //! var paymentService = new StripePaymentService();
        //! paymentService.processPayment(100);

        paymentService.processPayment(10);

    }



    //! setter injection
    // public void setpaymentService(PaymentService paymentService){
    //     this.paymentService = paymentService;
    // }

   
}
