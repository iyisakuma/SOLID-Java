package br.com.alura.rh.validacao;

import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidaReajustePerioticidade implements ValidaReajuste{
    @Override
    public void valida(Funcionario funcionario, BigDecimal aumento) {
        var hoje = LocalDate.now();
        var ultimoReajuste = funcionario.getDataUltimoReajuste();
        var periodoUltimoReajuste =  ChronoUnit.MONTHS.between(hoje, ultimoReajuste);
        if (periodoUltimoReajuste < 6) {
            throw new ValidacaoException("O último reajuste ocorreu no ultimo 6 meses");
        }
    }
}
