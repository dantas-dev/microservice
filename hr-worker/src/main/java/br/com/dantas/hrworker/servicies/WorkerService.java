package br.com.dantas.hrworker.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dantas.hrworker.entities.Worker;
import br.com.dantas.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;
	
	public List<Worker> findAll() {
		return repository.findAll();
	}

	public Optional<Worker> findById(Long id) {
		final var obj = repository.findById(id);
		return obj;
	}
}
