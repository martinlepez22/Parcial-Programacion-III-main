package com.resenas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resenas.entities.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
