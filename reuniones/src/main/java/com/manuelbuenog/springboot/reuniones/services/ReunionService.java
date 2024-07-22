package com.manuelbuenog.springboot.reuniones.services;

import com.manuelbuenog.springboot.reuniones.data.ReunionRepository;
import com.manuelbuenog.springboot.reuniones.model.Reunion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReunionService {

    private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public List<Reunion> getAllReuniones() {
        return reunionRepository.findAll();
    }

    public Reunion getById(Long id) {
        return reunionRepository.findById(id).get();
    }

}
