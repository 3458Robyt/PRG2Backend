package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unbosque.edu.co.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
