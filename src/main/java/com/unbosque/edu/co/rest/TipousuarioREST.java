package com.unbosque.edu.co.rest;

import java.net.*;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unbosque.edu.co.entity.Tipousuario;
import com.unbosque.edu.co.service.TipousuarioService;

@RestController
@RequestMapping("/tipousuarios/")
public class TipousuarioREST {

	@Autowired
	private TipousuarioService tipousuarioService;
	
	@GetMapping
	private ResponseEntity<List<Tipousuario>> getAllTiposuarios(){
		return ResponseEntity.ok(tipousuarioService.getAllTiposUsuarios());
	}
	
    @GetMapping("/{id}")
    private ResponseEntity<Tipousuario> getTipousuarioById(@PathVariable Long id) {
        Optional<Tipousuario> tipousuario = tipousuarioService.getTipousuarioById(id);
        return tipousuario.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    private ResponseEntity<Tipousuario> saveTipousuario (@RequestBody Tipousuario tipousuario){
    	
    	try {
        	Tipousuario ts = tipousuarioService.saveTipousuario(tipousuario);
//    		return ResponseEntity.created(new URI("/tipousuarios/"+ts.getId())).body(ts);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

    }
	
	
	
}
