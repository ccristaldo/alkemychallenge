package com.disney.demodisney0.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@SQLDelete(sql="UPDATE personaje_entity SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String nombre;
    private Double peso;
    private String historia;
    @ManyToMany(mappedBy = "personajes")
    private List<PeliculaEntity> perPelasoc = new ArrayList<>();
    private boolean deleted = Boolean.FALSE;

    public PersonajeEntity() {
    }

    public PersonajeEntity(Long id, String imagen, String nombre, Double peso, String historia, List<PeliculaEntity> perPelasoc, boolean deleted) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.peso = peso;
        this.historia = historia;
        this.perPelasoc = perPelasoc;
        this.deleted = deleted;
    }
}