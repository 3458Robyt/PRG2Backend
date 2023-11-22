package com.unbosque.edu.co.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unbosque.edu.co.entity.Usuario;
import com.unbosque.edu.co.service.UsuarioService;

@RestController
@RequestMapping ("/users/")
public class UsuarioREST {
	
	@Autowired
	private UsuarioService Usuarioservice;
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuarios(){
		return ResponseEntity.ok(Usuarioservice.findAll());
	}
	
}

