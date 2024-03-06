package com.loxassoft.departamentservices.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departaments")
@Data // define getter and setter
@AllArgsConstructor // define constructor con todos los parametros
@NoArgsConstructor // define constructor sin parameter
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String codigo;



}
