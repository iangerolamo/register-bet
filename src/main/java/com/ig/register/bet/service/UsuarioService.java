package com.ig.register.bet.service;

import com.ig.register.bet.model.Usuario;
import com.ig.register.bet.repository.UsuarioRepository;
import com.ig.register.bet.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder pe;

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    public Usuario consultarUsuarioPorId(Integer id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName()));
    }

//    public Cliente find(Integer id) {
//
//        UserSS user = UserService.authenticated();
//        if (user==null || !user.hasRole(Perfil.ADMIN) && !id.equals(user.getId())) {
//            throw new AuthorizationException("Acesso negado");
//        }
//
//        Optional<Cliente> obj = repo.findById(id);
//        return obj.orElseThrow(() -> new ObjectNotFoundException(
//                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
//    }

    public Usuario createUser(Usuario novoUsuario) {
        Usuario usuarioEditado = new Usuario();
        usuarioEditado.setUserName(novoUsuario.getUserName());
        usuarioEditado.setPassword(pe.encode(novoUsuario.getPassword()));
        usuarioEditado.setEmail(novoUsuario.getEmail());
        usuarioEditado.setUserFullName(novoUsuario.getUserFullName());
        usuarioEditado.setUserJoinData(LocalDate.now());


        return usuarioRepository.save(usuarioEditado);
    }

//    public Optional<Bet> editBet(Bet newBet, Integer id) {
//        return betRepository.findById(id)
//                .map(bet -> {
//                    bet.setEvento(newBet.getEvento());
//                    bet.setData(newBet.getData());
//                    bet.setEsporte(newBet.getEsporte());
//                    bet.setCompeticao(newBet.getCompeticao());
//                    bet.setMercado(newBet.getMercado());
//                    bet.setAposta(newBet.getAposta());
//                    bet.setLucro(newBet.getLucro());
//                    bet.setOdd(newBet.getOdd());
//
//                    return betRepository.save(bet);
//                });
//    }




}
