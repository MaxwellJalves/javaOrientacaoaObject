package com.java.poo.javapoo.domain.funcionario.usecase.obter_aumento_salarial;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.model.Gerente;

import java.math.BigDecimal;

public class ObtemAumentoSalarialGerente {

    public static void main(String[] args) {
        Gerente g = new Gerente("MAXWELL", BigDecimal.valueOf(2000).setScale(2), Departamento.GERENCIA, TempoDeCasa.UM_ANO);
        System.out.println("Salario Atual:   \t R$ " + g.getSalario());
        var salarioAtualizado =  g.aplicarReajusteSalarial(g.getSalario(),g.getTempoDeCasa());
        System.out.println("Novo Salario:    \t R$ " + salarioAtualizado);
    }
}
