package br.com.dantas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dantas.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
