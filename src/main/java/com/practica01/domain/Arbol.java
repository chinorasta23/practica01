package com.practica01.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arbol")
    private Long idArbol;
    private String tipo_arbol;
    private String habitat;
    private String nombre_comun;
    private String dureza_madera;
    private String tipo_flor;
    private String imagen;
    private int edad_arbol;
}
