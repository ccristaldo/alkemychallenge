package com.disney.demodisney0.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class PeliculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String titulo;
    private int calificacion;

    //@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
    //private List<PersonajeEntity> personajes = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE})
    private GeneroEntity genero;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PersonajeEntity> personajes = new ArrayList<>();

    public PeliculaEntity() {
    }

    public PeliculaEntity(Long id, String imagen, String titulo, int calificacion, GeneroEntity genero, List<PersonajeEntity> personajes) {
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.calificacion = calificacion;
        this.genero = genero;
        this.personajes = personajes;
    }
}
