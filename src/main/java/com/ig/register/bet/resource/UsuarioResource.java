package com.ig.register.bet.resource;

import com.ig.register.bet.model.Bet;
import com.ig.register.bet.model.Usuario;
import com.ig.register.bet.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    List<Usuario> getAll() {
        return usuarioService.getAll();
    }

    @PostMapping("/usuario")
    Usuario createUsuario(@RequestBody Usuario novoUsuario) {
        return usuarioService.createUser(novoUsuario);
    }


}
