package src.service;

import src.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajustes> validacoes;

    public ReajusteService(List<ValidacaoReajustes> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajusteSalarioFuncionario(Funcionario funcionario, BigDecimal aumento){
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
