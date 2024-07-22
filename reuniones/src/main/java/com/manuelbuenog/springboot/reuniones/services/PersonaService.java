package com.manuelbuenog.springboot.reuniones.services;

import com.manuelbuenog.springboot.reuniones.data.PersonaRepository;
import com.manuelbuenog.springboot.reuniones.model.Persona;
import javassist.NotFoundException;
import org.hibernate.annotations.NotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    public Persona getById(Long id) {
        return personaRepository.findById(id).get();
    }

}
