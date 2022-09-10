package com.dcp.usuario.model.repository;

import com.dcp.usuario.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
