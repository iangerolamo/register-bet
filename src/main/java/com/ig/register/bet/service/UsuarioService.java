package com.ig.register.bet.service;

import com.ig.register.bet.model.Bet;
import com.ig.register.bet.model.Usuario;
import com.ig.register.bet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

}
