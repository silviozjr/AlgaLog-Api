package com.sz.algalog.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sz.algalog.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Optional<Cliente> findByEmail(String email);
}
