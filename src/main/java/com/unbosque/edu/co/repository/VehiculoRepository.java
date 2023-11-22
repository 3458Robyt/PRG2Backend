package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbosque.edu.co.entity.Vehicle;

public interface VehiculoRepository extends JpaRepository<Vehicle, Long> {
    // Puedes agregar métodos específicos de consulta si los necesitas
}
