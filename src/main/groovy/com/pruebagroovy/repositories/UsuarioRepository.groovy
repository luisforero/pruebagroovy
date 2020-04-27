package com.pruebagroovy.repositories


import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository extends CrudRepository<com.pruebagroovy.entities.Usuario, Integer>
{
    @Query("select u from Usuario u where u.documento = :identificacion")
    List findUsuarios( @Param("identificacion") Integer identificacion )
}