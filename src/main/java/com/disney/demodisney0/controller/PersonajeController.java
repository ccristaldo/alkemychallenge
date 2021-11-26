package com.disney.demodisney0.controller;

import com.disney.demodisney0.dto.GeneroDTO;
import com.disney.demodisney0.dto.PersonajeDTO;
import com.disney.demodisney0.service.GeneroService;
import com.disney.demodisney0.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @PostMapping
    public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje){
        PersonajeDTO personajeGuardado = personajeService.save(personaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
    }

    @GetMapping
    public ResponseEntity<List<PersonajeDTO>> getAll(){
        List<PersonajeDTO> personajes = personajeService.getAllPersonaje();
        return ResponseEntity.ok().body(personajes);
        //TODO: continuar desde aqui

    }
}
