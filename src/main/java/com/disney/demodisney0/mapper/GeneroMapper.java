package com.disney.demodisney0.mapper;

import com.disney.demodisney0.dto.GeneroDTO;
import com.disney.demodisney0.entity.GeneroEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GeneroMapper {

    public GeneroEntity generoDto2Entity(GeneroDTO dto){
        GeneroEntity generoEntity = new GeneroEntity();
        generoEntity.setImagen(dto.getImagen());
        generoEntity.setNombre(dto.getNombre());
        return generoEntity;
    }

    public GeneroDTO generoEntity2Dto(GeneroEntity entity){
        GeneroDTO generodto = new GeneroDTO();
        generodto.setId(entity.getId());
        generodto.setImagen(entity.getImagen());
        generodto.setNombre(entity.getNombre());
        return generodto;
    }

    public List<GeneroDTO> listaEntity2Dto(List<GeneroEntity> entities) {
        List<GeneroDTO> generoDTOS = new ArrayList<>();
        for (GeneroEntity g : entities){
            generoDTOS.add(generoEntity2Dto(g));
        }
        return generoDTOS;
    }
}
