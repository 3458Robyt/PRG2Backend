package com.unbosque.edu.co.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unbosque.edu.co.entity.User;
import com.unbosque.edu.co.service.UsuarioService;

@RestController
@RequestMapping("/users/")
public class UsuarioREST {

	@Autowired
	private UsuarioService Usuarioservice;

	@GetMapping
	private ResponseEntity<List<User>> getAllUsuarios() {
		return ResponseEntity.ok(Usuarioservice.findAll());
	}

	@PostMapping()
	public void guardarUsuario(@RequestBody User usuario) {
		Usuarioservice.guardarUsuario(usuario);
	}
	
	
    @PostMapping("/inhabilitar/{login}")
    public ResponseEntity<String> inhabilitarUsuario(@PathVariable("login") String login) {
        Usuarioservice.inhabilitarUsuario(login);
        return ResponseEntity.ok("Usuario inhabilitado correctamente");
    }
    
    @GetMapping("/buscar/{login}")
    public ResponseEntity<Optional<User>> buscarByIdg(@PathVariable("login") String login) {
		return ResponseEntity.ok(Usuarioservice.obtenerById(login));
    }
    
    
    
}
