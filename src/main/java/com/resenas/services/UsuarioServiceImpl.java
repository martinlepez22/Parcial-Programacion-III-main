package com.resenas.services;

import com.resenas.entities.Usuario;
import com.resenas.repositories.BaseRepository;

import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService{
    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository){ super(baseRepository);   }

}
