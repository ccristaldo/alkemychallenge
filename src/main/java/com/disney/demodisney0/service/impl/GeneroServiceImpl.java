package com.disney.demodisney0.service.impl;

import com.disney.demodisney0.controller.repository.GeneroRepository;
import com.disney.demodisney0.dto.GeneroDTO;
import com.disney.demodisney0.entity.GeneroEntity;
import com.disney.demodisney0.mapper.GeneroMapper;
import com.disney.demodisney0.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;

    @Autowired
    private GeneroRepository generoRepository;

    public GeneroDTO save(GeneroDTO dto) {
        GeneroEntity entity = generoMapper.generoDto2Entity(dto);
        GeneroEntity entityGuardado = generoRepository.save(entity);
        GeneroDTO result = generoMapper.generoEntity2Dto(entityGuardado);
        System.out.println("Guardar");
        return result;
    }

    public List<GeneroDTO> getAllGeneros() {
        List<GeneroEntity> entities = generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.listaEntity2Dto(entities);
        return result;
    }
}
