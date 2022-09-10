package com.dcp.usuario.controller;

import com.dcp.usuario.model.entity.Usuario;
import com.dcp.usuario.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(value = "*")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping()
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @PostMapping()
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PostMapping("/update/{id}")
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id){
        System.out.println("id:  " + id);
        Optional<Usuario> usuariodb = usuarioService.findById(id);
        if (usuariodb.isPresent()){
            Usuario usuarioActual = usuariodb.get();
            usuarioActual.setEdad(usuario.getEdad());
        return usuarioService.save(usuarioActual);
        }else {
            return new Usuario();
        }
    }
}
