package com.unbosque.edu.co.service;

import java.util.List;
import java.util.Optional;
import com.unbosque.edu.co.entity.Tipousuario;
import com.unbosque.edu.co.repository.TipousuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipousuarioService {

    private final TipousuarioRepository TipousuarioRepository;

    @Autowired
    public TipousuarioService(TipousuarioRepository TipousuarioRepository) {
        this.TipousuarioRepository = TipousuarioRepository;
    }

    public List<Tipousuario> getAllTiposUsuarios() {
        return TipousuarioRepository.findAll();
    }

    public Optional<Tipousuario> getTipousuarioById(Long id) {
        return TipousuarioRepository.findById(id);
    }

    public Tipousuario saveTipousuario(Tipousuario Tipousuario) {
        return TipousuarioRepository.save(Tipousuario);
    }

    public void deleteTipousuario(Long id) {
        TipousuarioRepository.deleteById(id);
    }
}
