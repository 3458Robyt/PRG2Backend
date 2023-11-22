package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.co.entity.Auditory;

public interface AuditoriaRepository extends JpaRepository<Auditory, Long> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
