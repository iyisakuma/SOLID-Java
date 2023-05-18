package br.com.alura.rh.servico;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.validacao.ValidaReajuste;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteServce {

    private List<ValidaReajuste> validacoes;

    public ReajusteServce(List<ValidaReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarFuncionario(Funcionario funcionario, BigDecimal aumento){
        validacoes.forEach(validacao -> validacao.valida(funcionario, aumento));

        var salarioAtualizado = funcionario.getSalario().add(aumento);
        funcionario.atualizaSalario(salarioAtualizado);
    }
}
