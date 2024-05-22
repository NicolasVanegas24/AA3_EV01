package com.proyectodbr.prueba.model;

//Se genera la entidad de la aplicación

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//Llamado de elementos de las dependecias 
@Entity
@Data
//Creación tabla de usuarios
public class Usuarios {
    
    @Id
    //Generación de entidades
    @Column 
    private Long idusu;
    
    @Column
    private String nombres;
    
    @Column 
    private String email;
    
    @Column 
    private String direccion;
    
    @Column
    private String nomusu;
    
    @Column 
    private String celular;
    
    @Column 
    private String contraseña;
        
}
