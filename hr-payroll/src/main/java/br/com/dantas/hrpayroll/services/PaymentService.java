package br.com.dantas.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.dantas.hrpayroll.entities.Payment;
import br.com.dantas.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workerId, int days) {
		Map<String, String> uriVariable = new HashMap<>();
		uriVariable.put("id", String.valueOf(workerId));
		final var worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariable);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
