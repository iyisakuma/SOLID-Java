package br.com.alura.rh.model;

import lombok.Getter;

import java.math.BigDecimal;
@Getter
public class Terceirizado {

    private DadosPessoais dadosPessoais;
    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais =  new DadosPessoais(nome, cpf, cargo, salario);
    }
}
