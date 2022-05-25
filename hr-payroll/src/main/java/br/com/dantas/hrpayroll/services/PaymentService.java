package br.com.dantas.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.dantas.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long id, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
