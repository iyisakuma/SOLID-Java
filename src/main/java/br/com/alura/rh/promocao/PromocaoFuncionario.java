package br.com.alura.rh.promocao;

import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoFuncionario {

    public void promove(Funcionario funcionario, boolean metaBatida){
        if(funcionario.getDadosPessoais().getCargo() == Cargo.GERENTE){
            throw new ValidacaoException("Gerente não pode ser promovido!");
        }
        if(metaBatida){
            var proximoCargo = funcionario.getDadosPessoais().getCargo().proximoCargo();
            funcionario.promoveCargo(proximoCargo);
        }else {
            throw new ValidacaoException("Meta não alcançada!");
        }
    }
}
