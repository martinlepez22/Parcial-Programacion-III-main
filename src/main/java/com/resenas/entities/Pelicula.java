package com.resenas.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pelicula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Pelicula extends Base {

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "reseña", length = 2000)
    private String resena;

    @Column(name = "calificacion")
    private int calificacion;

   // @ManyToMany(mappedBy = "peliculas")
    //private List<Usuario> usuarios = new ArrayList<Usuario>();
}
