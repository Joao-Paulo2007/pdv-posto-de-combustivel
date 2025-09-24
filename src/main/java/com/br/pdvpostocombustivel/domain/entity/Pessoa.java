package com.br.pdvpostocombustivel.domain.entity;

import com.br.pdvpostocombustivel.enums.TipoPessoa;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;


@Entity
@Table(name = "pessoa")
public class Pessoa {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_completo",length = 200, nullable = false)
    private String nomeCompleto;

    @Column(name = "cpf_cnpj",length = 14, nullable = false)
    private String cpfCnpj;

    @Column(name = "data_nascimento",length = 10, nullable = false)
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo pessoa", nullable = false, length = 15)
    private TipoPessoa tipoPessoa;

    @Column(name = "numero_ctps",length = 12)
    private Long numeroCtps;

    // construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, LocalDate dataNascimento, Long numeroCtps, TipoPessoa tipoPessoa) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
        this.id = id;
        this.tipoPessoa = tipoPessoa;

    }

    public Pessoa() {

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
        public TipoPessoa getTipoPessoa(){
            return tipoPessoa;
        }
        public void setTipoPessoa(TipoPessoa tipoPessoa){
        this.tipoPessoa = tipoPessoa;
        }
}