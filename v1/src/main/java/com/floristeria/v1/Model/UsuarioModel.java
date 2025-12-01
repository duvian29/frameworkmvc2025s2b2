package com.floristeria.v1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "tbl_usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long IdUsuario;
    @Column(name = "nombre", nullable = true, length= 50)
    String NombreUsuario;
    @Column(name = "contrasena", nullable = true, length= 50)
    String Contrasena;
}
