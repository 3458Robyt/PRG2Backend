package com.unbosque.edu.co.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unbosque.edu.co.entity.Usuario;
import com.unbosque.edu.co.repository.UsuarioRepository;

@Service
public interface UsuarioService {
	
	public List<Usuario> findAll(); 

}
