package br.com.r4s.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.r4s.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
