package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.co.entity.Client;

public interface ClienteRepository extends JpaRepository<Client, Integer> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
