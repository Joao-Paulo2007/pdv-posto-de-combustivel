package com.br.pdvpostocombustivel;

import com.br.pdvpostocombustivel.domain.entity.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdvpostocombustivelApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PdvpostocombustivelApplication.class, args);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNomeCompleto("José");
        pessoa1.setCpfCnpj("07864343576");
        pessoa1.setNumeroCtps(32453L);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNomeCompleto("Maria");
        pessoa2.setCpfCnpj("65798241008");
        pessoa2.setNumeroCtps(87312L);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNomeCompleto("João");
        pessoa3.setCpfCnpj("26174097534");
        pessoa3.setNumeroCtps(23769L);

      System.out.println("Nome Completo: " + pessoa1.getNomeCompleto());
      System.out.println("CPF/CNPJ" + pessoa1.getCpfCnpj());
      System.out.println("NumeroCtps" + pessoa1.getNumeroCtps());

      System.out.println("-----------------------------------------------------------------");

      System.out.println("Nome Completo: " +pessoa2.getNomeCompleto());
      System.out.println("CPF/CNPJ: " +pessoa2.getCpfCnpj());
      System.out.println("NumeroCtps: " +pessoa2.getNumeroCtps());

      System.out.println("-----------------------------------------------------------------");

      System.out.println("Nome Completo: " +pessoa3.getNomeCompleto());
      System.out.println("CPF/CNPJ: " +pessoa3.getCpfCnpj());
      System.out.println("NumeroCtps: " +pessoa3.getNumeroCtps());
	}
}
