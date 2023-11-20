package com.unbosque.edu.co.service;

import java.util.List;
import java.util.Optional;
import com.unbosque.edu.co.entity.Parametro;
import com.unbosque.edu.co.repository.ParametroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParametroService {

    private final ParametroRepository parametroRepository;

    @Autowired
    public ParametroService(ParametroRepository parametroRepository) {
        this.parametroRepository = parametroRepository;
    }

    public List<Parametro> getAllParametros() {
        return parametroRepository.findAll();
    }

    public Optional<Parametro> getParametroById(Long id) {
        return parametroRepository.findById(id);
    }

    public Parametro saveParametro(Parametro parametro) {
        return parametroRepository.save(parametro);
    }

    public void deleteParametro(Long id) {
        parametroRepository.deleteById(id);
    }
}
