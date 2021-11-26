package com.disney.demodisney0.service;

import com.disney.demodisney0.dto.GeneroDTO;

import java.util.List;

public interface GeneroService {

    GeneroDTO save (GeneroDTO dto);

    List<GeneroDTO> getAllGeneros();

}
