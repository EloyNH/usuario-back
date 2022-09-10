package com.dcp.usuario.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "distrito")
//    private List<Usuario> usuarios;

}
