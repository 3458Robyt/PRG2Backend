package com.unbosque.edu.co.service;

import java.util.List;
import java.util.Optional;
import com.unbosque.edu.co.entity.Auditoria;
import com.unbosque.edu.co.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditoriaService {

    private final AuditoriaRepository auditoriaRepository;

    @Autowired
    public AuditoriaService(AuditoriaRepository auditoriaRepository) {
        this.auditoriaRepository = auditoriaRepository;
    }

    public List<Auditoria> getAllAuditorias() {
        return auditoriaRepository.findAll();
    }

    public Optional<Auditoria> getAuditoriaById(Long id) {
        return auditoriaRepository.findById(id);
    }

    public Auditoria saveAuditoria(Auditoria auditoria) {
        return auditoriaRepository.save(auditoria);
    }

    public void deleteAuditoria(Long id) {
        auditoriaRepository.deleteById(id);
    }
}
