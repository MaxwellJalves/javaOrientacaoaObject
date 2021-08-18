package com.java.poo.javapoo.domain.calculo;

import com.java.poo.javapoo.domain.calculo.exception.RegraPercentualPermitidoException;

public class Percentual {

    private Percentual() {

    }

    /**
     * Realizando  criação da regra que define o percentual permitido no sistema.
     */
    public static Double getPercentual(int percentual) {

        switch (percentual) {
            case 1:
                return 0.01;
            case 2:
                return 0.02;
            case 3:
                return 0.03;
            case 4:
                return 0.035;
            default:
                throw new RegraPercentualPermitidoException("PERCENTUAL NÃO PERMITIDO , CONSULTE O GESTOR ADMINISTRATIVO PARA OBTER MAIS DETALHES!");
        }

    }

}
