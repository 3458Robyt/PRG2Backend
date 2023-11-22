package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unbosque.edu.co.entity.Tipousuario;

@Repository
public interface TipousuarioRepository extends JpaRepository<Tipousuario, Long> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
