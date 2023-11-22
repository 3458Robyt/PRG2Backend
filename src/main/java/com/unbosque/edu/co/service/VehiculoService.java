package com.unbosque.edu.co.service;

import java.util.List;
import java.util.Optional;
import com.unbosque.edu.co.entity.Vehicle;

import com.unbosque.edu.co.repository.VehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {

    private final VehiculoRepository vehicleRepository;

    @Autowired
    public VehiculoService(VehiculoRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

//    public Optional<Vehicle> getVehicleById(Integer id) {
//        return vehicleRepository.findById(id);
//    }

    public Vehicle saveVehicle(Vehicle Vehicle) {
        return vehicleRepository.save(Vehicle);
    }

//    public void deleteVehicle(Integer id) {
//        vehicleRepository.deleteById(id);
//    }
}
