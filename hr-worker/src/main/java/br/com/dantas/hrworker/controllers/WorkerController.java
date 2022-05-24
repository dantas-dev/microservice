package br.com.dantas.hrworker.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dantas.hrworker.entities.Worker;
import br.com.dantas.hrworker.servicies.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
	
	@Autowired
	private WorkerService service;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		final var list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id) {
		final var obj = service.findById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(obj);
	}

}
