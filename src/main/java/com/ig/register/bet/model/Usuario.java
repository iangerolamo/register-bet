package com.ig.register.bet.model;

import com.ig.register.bet.model.enums.Perfil;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Entity(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;
    private String password;
    private String email;
    private String userFullName;
    private LocalDate userJoinData;

    @OneToMany
    private final List<Bet> apostas = new ArrayList<>();

    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name="PERFIS")
    private final Set<Integer> perfis = new HashSet<>();

    public Usuario() {
        addPerfil(Perfil.ADMIN);
    }

    public Usuario(Integer id,
                   String userName,
                   String password,
                   String email,
                   String userFullName,
                   LocalDate userJoinData) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userFullName = userFullName;
        this.userJoinData = userJoinData;
        addPerfil(Perfil.CLIENTE);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public LocalDate getUserJoinData() {
        return userJoinData;
    }

    public void setUserJoinData(LocalDate userJoinData) {
        this.userJoinData = userJoinData;
    }

    public void addPerfil(Perfil perfil) {
        perfis.add(perfil.getCod());
    }

    public Set<Perfil> getPerfis() {
        return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
    }

}
