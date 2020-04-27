package com.pruebagroovy.services

import com.pruebagroovy.entities.Usuario
import com.pruebagroovy.repositories.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioService
{
    @Autowired
    UsuarioRepository usuarioRepository


    List findAll()
    {
        usuarioRepository.findAll()
    }


    Usuario agregarUsuario( Usuario usuario )
    {
        return usuarioRepository.save( usuario )
    }


    def eliminarUsuario( Integer identificacion )
    {
        def usuarios = usuarioRepository.findUsuarios( identificacion )
        if ( usuarios )
        {
            usuarioRepository.deleteAll( usuarios )
        }
    }
}
