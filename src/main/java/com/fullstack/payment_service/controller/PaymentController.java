package com.fullstack.payment_service.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fullstack.payment_service.model.Payment;
import com.fullstack.payment_service.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @GetMapping
    public List<Payment> getAllPayments() {
        return service.findAll();
    }

    @PostMapping
    public String createPayment(@RequestBody Payment payment) {
        return service.create(payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        service.delete(id);
    }
}