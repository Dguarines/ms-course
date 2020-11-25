package br.com.r4s.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.r4s.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
