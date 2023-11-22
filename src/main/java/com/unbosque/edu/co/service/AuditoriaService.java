package com.unbosque.edu.co.service;

import java.util.List;
import java.util.Optional;
import com.unbosque.edu.co.entity.Auditory;
import com.unbosque.edu.co.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditoriaService {

    private final AuditoriaRepository auditoriaRepository;

    @Autowired
    public AuditoriaService(AuditoriaRepository AuditoryRepository) {
        this.auditoriaRepository = AuditoryRepository;
    }

    public List<Auditory> getAllAuditorys() {
        return auditoriaRepository.findAll();
    }

//    public Optional<Auditory> getAuditoryById(Integer id) {
//        return auditoriaRepository.findById(id);
//    }

    public Auditory saveAuditory(Auditory auditoria) {
        return auditoriaRepository.save(auditoria);
    }

//    public void deleteAuditory(Integer id) {
//    	auditoriaRepository.deleteById(id);
//    }
}
