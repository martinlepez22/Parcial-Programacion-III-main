package com.resenas.services;

import com.resenas.entities.Pelicula;
import com.resenas.repositories.BaseRepository;

import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl extends BaseServiceImpl<Pelicula, Long> implements PeliculaService {
    public PeliculaServiceImpl(BaseRepository<Pelicula, Long> baseRepository) {
        super(baseRepository);
    }
}