package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String nomeCompleto;

    @Column(length = 14, nullable = false)
    private String cpfCnpj;

    @Column(length = 10, nullable = false)
    private LocalDate dataNascimento;

    @Column(length = 12)
    private Long numeroCtps;

    // construtor
    public Pessoa( ) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
        this.id = id;
    }


    // getters
    public String getNomeCompleto() {

        return nomeCompleto;
    }

    // setters
    public void setNomeCompleto(String nomeCompleto) {

        this.nomeCompleto = nomeCompleto;
    }

    //getters
    public String getCpfCnpj() {

        return cpfCnpj;
    }

    //setters

    public void setCpfCnpj(String cpfCnpj) {

        this.cpfCnpj = cpfCnpj;
    }

    //getters
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    //setters
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //getters
    public Long getNumeroCtps() {
        return numeroCtps;
    }

    //setters
    public void setNumeroCtps(Long numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}