package com.dcp.usuario.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String correo;
    private String nombre;
    private String apellido;
    private Integer edad;

    //@ManyToOne()
    @JoinColumn(name = "distrito_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"}, allowSetters = true)
    private Distrito distrito;

}
