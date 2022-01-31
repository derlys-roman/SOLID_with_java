package src.service;

import src.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajustes {
    void validar(Funcionario funcionario, BigDecimal aumento);

}
