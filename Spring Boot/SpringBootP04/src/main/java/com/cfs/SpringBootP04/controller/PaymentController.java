package com.cfs.SpringBootP04.controller;

import com.cfs.SpringBootP04.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.processing.Generated;

public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String pay(){
        return paymentService.pay();
    }
}
