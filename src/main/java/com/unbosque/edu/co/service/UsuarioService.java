package com.unbosque.edu.co.service;

import java.util.List;
import java.util.Optional;

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
    
    public void guardarUsuario(User usuario) {
		if (!usuarioRepository.existsById(usuario.getLogin())) {
			usuarioRepository.save(usuario);
		} else {
			System.out.println("Ya existe");
		}
	}
    
    public void inhabilitarUsuario(String login) {
        Optional<User> optionalUser = usuarioRepository.findById(login);
        if (optionalUser.isPresent()) {
            User usuario = optionalUser.get();
            usuario.setEstado("I");
            usuarioRepository.save(usuario);
        } else {
            System.out.println("Usuario no encontrado");
        }
    }
    
    public Optional<User> obtenerById(String login) {
    	if (!usuarioRepository.existsById(login)) {
			System.out.println("No existe");
		} else {
			return usuarioRepository.findById(login);
		}
    	return usuarioRepository.findById(login);
    }

}
