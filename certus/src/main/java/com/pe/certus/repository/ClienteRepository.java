package com.pe.certus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.certus.entity.Cliente;

@Repository //Acceso a datos
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
