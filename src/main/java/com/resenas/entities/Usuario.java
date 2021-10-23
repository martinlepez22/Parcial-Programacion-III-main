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
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Usuario extends Base {

    @Column(name = "nick")
    private String nick;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Pelicula> peliculas;

    //@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    //@JoinTable(
      //      name="usuario_pelicula",
        //    joinColumns = @JoinColumn(name = "usuario_id"),
          //  inverseJoinColumns = @JoinColumn(name = "pelicula_id")
    //)
    //private List<Pelicula> peliculas = new ArrayList<Pelicula>();
}
