package com.disney.demodisney0.mapper;

import com.disney.demodisney0.dto.PersonajeDTO;
import com.disney.demodisney0.entity.PersonajeEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonajeMapper {

    public PersonajeDTO personajeEntity2DTO(PersonajeEntity entity){
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(entity.getId());
        personajeDTO.setHistoria(entity.getHistoria());
        personajeDTO.setImagen(entity.getImagen());
        personajeDTO.setPeso(entity.getPeso());
        personajeDTO.setNombre(entity.getNombre());
        return personajeDTO;
    }

    public List<PersonajeDTO> listaEntity2DTO(List<PersonajeEntity> entities){
        List<PersonajeDTO> personajeDTOS = new ArrayList<>();
        for (PersonajeEntity p : entities){
            personajeDTOS.add(personajeEntity2DTO(p));
        }
        return personajeDTOS;
    }

    public PersonajeEntity personajeDTO2Entity(PersonajeDTO dto) {
        PersonajeEntity entity = new PersonajeEntity();
        entity.setNombre(dto.getNombre());
        entity.setHistoria(dto.getHistoria());
        entity.setImagen(dto.getImagen());
        entity.setPeso(dto.getPeso());
        return entity;
    }


}
