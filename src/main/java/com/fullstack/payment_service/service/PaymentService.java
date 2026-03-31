package com.fullstack.payment_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.payment_service.model.Payment;
import com.fullstack.payment_service.repository.PaymentRepository;

@Service
public class PaymentService {
    @Autowired 
    private PaymentRepository repo;

    public String create(Payment p) {
        repo.save(p); 
        return "Pago procesado correctamente";
    }
    public List<Payment> findAll()  { 
        return repo.findAll(); }
        
    public void delete(Long id)     { 
        repo.delete(id); }
}
