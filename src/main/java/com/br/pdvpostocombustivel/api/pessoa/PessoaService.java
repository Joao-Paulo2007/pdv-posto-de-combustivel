package com.br.pdvpostocombustivel.api.pessoa;


import com.br.pdvpostocombustivel.domain.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PessoaService {

        private final PessoaService repository;

    public PessoaService(PessoaService repository) {
        this.repository = repository;
    }

    public PessoaService getRepository(){
        return repository;
    }

}
