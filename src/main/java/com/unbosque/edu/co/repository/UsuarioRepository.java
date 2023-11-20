package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unbosque.edu.co.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
