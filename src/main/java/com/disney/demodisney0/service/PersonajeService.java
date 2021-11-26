package com.disney.demodisney0.service;


import com.disney.demodisney0.dto.PersonajeDTO;

import java.util.List;

public interface PersonajeService {
    List<PersonajeDTO> getAllPersonaje();

    PersonajeDTO save(PersonajeDTO personaje);
}
