package com.sz.algalog.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sz.algalog.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
