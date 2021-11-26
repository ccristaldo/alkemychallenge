package com.disney.demodisney0.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class GeneroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String imagen;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private List<PeliculaEntity> genpelasoc = new ArrayList<>();

    public GeneroEntity() {
    }

    public GeneroEntity(Long id, String nombre, String imagen, List<PeliculaEntity> genpelasoc) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.genpelasoc = genpelasoc;
    }
}
