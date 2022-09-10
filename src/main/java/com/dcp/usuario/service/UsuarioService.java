package com.dcp.usuario.service;

import com.dcp.usuario.model.entity.Usuario;
import com.dcp.usuario.model.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> findAll();
    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Long id);
    void deleteById(Long id);


}
