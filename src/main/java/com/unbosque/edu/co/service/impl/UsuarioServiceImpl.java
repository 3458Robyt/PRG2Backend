package com.unbosque.edu.co.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unbosque.edu.co.entity.Usuario;
import com.unbosque.edu.co.repository.UsuarioRepository;
import com.unbosque.edu.co.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
