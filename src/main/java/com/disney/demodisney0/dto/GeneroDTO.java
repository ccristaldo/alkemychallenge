package com.disney.demodisney0.dto;

import com.disney.demodisney0.entity.PeliculaEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class GeneroDTO {

    private Long id;
    private String nombre;
    private String imagen;
    //private List<PeliculaEntity> genpelasoc = new ArrayList<>();

}
