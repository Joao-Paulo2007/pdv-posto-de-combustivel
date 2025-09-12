package com.br.pdvpostocombustivel.domain.entity;

import java.util.Date;

public class Pessoa{

    // atributos
    private String nomeCompleto;
    private String cpfCnpj;
    private Date dataNascimento;
    private Integer numeroCtps;

    // construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, Integer numeroCtps) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
    }

    // getters
    public String getNomeCompleto(){
        return nomeCompleto;
    }

    // setters
    public void setNomeCompleto(String nomeCompleto){
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
    public Date getDataNascimento() {
        return dataNascimento;
    }

    //setters
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //getters
    public Integer getNumeroCtps() {
        return numeroCtps;
    }

    //setters
    public void setNumeroCtps(Integer numeroCtps) {
        this.numeroCtps = numeroCtps;
    }
}