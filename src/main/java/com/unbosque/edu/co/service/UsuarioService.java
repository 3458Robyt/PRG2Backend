package com.unbosque.edu.co.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unbosque.edu.co.entity.User;
import com.unbosque.edu.co.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
    private UsuarioRepository usuarioRepository;

    public List<User> findAll() {
        return usuarioRepository.findAll();
    }
    
    public User guardarUsuario(User usuario) {

		return usuarioRepository.save(usuario);

	}
}
