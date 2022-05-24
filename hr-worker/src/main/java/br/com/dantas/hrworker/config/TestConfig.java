package br.com.dantas.hrworker.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.dantas.hrworker.entities.Worker;
import br.com.dantas.hrworker.repositories.WorkerRepository;

@Configuration
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private WorkerRepository workerRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Worker worker1 = new Worker(null, "Bob", 200.0);
        Worker worker2 = new Worker(null, "Maria", 300.0);
        Worker worker3 = new Worker(null, "Alex", 250.0);
        workerRepository.saveAll(Arrays.asList(worker1, worker2, worker3));
	}
	
	

}
