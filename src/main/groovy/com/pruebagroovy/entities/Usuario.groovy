package com.pruebagroovy.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id
    String nombre
    Integer documento
}
