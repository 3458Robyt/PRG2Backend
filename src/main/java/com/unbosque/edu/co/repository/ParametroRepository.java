package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unbosque.edu.co.entity.Parametro;

public interface ParametroRepository extends JpaRepository<Parametro, Long> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
