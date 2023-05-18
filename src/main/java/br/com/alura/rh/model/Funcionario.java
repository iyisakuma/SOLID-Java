package br.com.alura.rh.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Funcionario {


	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais =  new DadosPessoais(nome, cpf, cargo, salario);
	}

	public void atualizaSalario(BigDecimal salarioAtualizado) {
		this.dadosPessoais.setSalario(dadosPessoais.getSalario().add(salarioAtualizado));
		this.dataUltimoReajuste = LocalDate.now();
	}

	public void promoveCargo(Cargo proximoCargo) {
		dadosPessoais.setCargo(proximoCargo);
	}
}
