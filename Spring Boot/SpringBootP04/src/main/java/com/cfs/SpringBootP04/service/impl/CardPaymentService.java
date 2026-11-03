package com.cfs.SpringBootP04.service.impl;

import com.cfs.SpringBootP04.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class CardPaymentService implements PaymentService
{
    public String pay()
    {
        return "CARD";
    }
}