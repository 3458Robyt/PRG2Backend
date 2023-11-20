package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unbosque.edu.co.entity.Auditoria;

public interface AuditoriaRepository extends JpaRepository<Auditoria, Long> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
