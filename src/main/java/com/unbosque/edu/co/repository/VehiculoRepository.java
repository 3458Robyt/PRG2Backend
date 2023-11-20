package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unbosque.edu.co.entity.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
