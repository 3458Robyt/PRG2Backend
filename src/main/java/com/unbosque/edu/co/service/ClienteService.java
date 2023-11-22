package com.unbosque.edu.co.service;

import java.util.List;
import java.util.Optional;

import com.unbosque.edu.co.entity.Client;
import com.unbosque.edu.co.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Client> getAllClientes() {
        return clienteRepository.findAll();
    }

//    public Optional<Client> getClienteById(Integer id) {
//        return clienteRepository.findById(id);
//    }

    public Client saveCliente(Client cliente) {
        return clienteRepository.save(cliente);
    }

//    public void deleteCliente(Integer id) {
//        clienteRepository.deleteById(id);
//    }
}
