package com.disney.demodisney0.service.impl;

import com.disney.demodisney0.controller.repository.PersonajeRepository;
import com.disney.demodisney0.dto.PersonajeDTO;
import com.disney.demodisney0.entity.PersonajeEntity;
import com.disney.demodisney0.mapper.PersonajeMapper;
import com.disney.demodisney0.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Autowired
    private PersonajeMapper personajeMapper;

    @Override
    public List<PersonajeDTO> getAllPersonaje() {
        List<PersonajeEntity> entities = personajeRepository.findAll();
        List<PersonajeDTO> result = personajeMapper.listaEntity2DTO(entities);
        return result;
    }

    @Override
    public PersonajeDTO save(PersonajeDTO dto) {
        PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
        PersonajeEntity personajeGuardado = personajeRepository.save(entity);
        PersonajeDTO result = personajeMapper.personajeEntity2DTO(personajeGuardado);

        return result;
    }


}
