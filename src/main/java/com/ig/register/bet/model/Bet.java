package com.ig.register.bet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;


@Entity
public class Bet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String evento;
    private LocalDate data;
    private String esporte;
    private String competicao;
    private String mercado;
    private BigDecimal aposta;
    private BigDecimal lucro;
    private BigDecimal odd;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public Bet() {
    }

    public Bet(Integer id,
               String evento,
               LocalDate data,
               String esporte,
               String competicao,
               String mercado,
               BigDecimal aposta,
               BigDecimal lucro,
               BigDecimal odd,
               Usuario usuario
                ) {
        this.id = id;
        this.evento = evento;
        this.data = data;
        this.esporte = esporte;
        this.competicao = competicao;
        this.mercado = mercado;
        this.aposta = aposta;
        this.lucro = lucro;
        this.odd = odd;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public String getCompeticao() {
        return competicao;
    }

    public void setCompeticao(String competicao) {
        this.competicao = competicao;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public BigDecimal getAposta() {
        return aposta;
    }

    public void setAposta(BigDecimal aposta) {
        this.aposta = aposta;
    }

    public BigDecimal getLucro() {
        return lucro;
    }

    public void setLucro(BigDecimal lucro) {
        this.lucro = lucro;
    }

    public BigDecimal getOdd() {
        return odd;
    }

    public void setOdd(BigDecimal odd) {
        this.odd = odd;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
