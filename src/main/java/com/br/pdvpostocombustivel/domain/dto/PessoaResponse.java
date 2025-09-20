package com.br.pdvpostocombustivel.domain.dto;

//Para Resposta

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record PessoaResponse(
    Long id,
    String nomeCompleto,
    String cpfCnpj,
    Long numeroCtps,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate dataNascimento)
{}
