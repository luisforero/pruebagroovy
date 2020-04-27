package com.pruebagroovy.controllers


import com.pruebagroovy.services.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("usuarios")
class UsuarioController
{
    @Autowired
    private UsuarioService usuarioService


    @GetMapping("")
    List<com.pruebagroovy.entities.Usuario> getUsuarios()
    {
        usuarioService.findAll()
    }


    @PostMapping(path = "/agrUsuario")
    ResponseEntity agregarUsuario( @RequestBody com.pruebagroovy.entities.Usuario usuario )
    {
        usuarioService.agregarUsuario( usuario )
        return new ResponseEntity( "Usuario Ingresado Correctamente", HttpStatus.OK )
    }


    @DeleteMapping("/removerUsuario")
    ResponseEntity removerUsuario( @RequestParam(name = "identificacion") Integer identificacion )
    {
        usuarioService.eliminarUsuario( identificacion )
        return new ResponseEntity( "Usuario ${identificacion} Removido", HttpStatus.OK )
    }

}
