package br.com.alura.rh.validacao;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidaReajuste {
    void valida(Funcionario funcionario, BigDecimal aumento);
}
