package com.java.poo.javapoo.domain.calculo;

import com.java.poo.javapoo.domain.calculo.exception.RegraSalarialException;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class ReajusteSalarial implements PlanoDeCarreira {

    @Override
    public BigDecimal aplicarReajusteSalarial(BigDecimal salario, TempoDeCasa tempo) {
        switch (tempo) {
            case MENOS_DE_SEIS_MESES:
                throw new RegraSalarialException("NÃO É PERMITIDO AUMENTO PARA FUNCIONÁRIOS COM MENOS DE 6 MESES.");
            case UM_ANO:
                return salario.multiply(BigDecimal.valueOf(Percentual.getPercentual(3)));
            case UM_ANO_E_SEIS_MESES:
                return salario.multiply(BigDecimal.valueOf(Percentual.getPercentual(2)));
            case DOIS_ANOS_OU_MAIS:
                return salario.multiply(BigDecimal.valueOf(Percentual.getPercentual(1)));
            default:
                throw new RegraSalarialException("VALIDO A REGRA DE AJUSTE SALARIAL JUNTO COM O GESTOR ADMINISTRATIVO.");
        }

    }

}
