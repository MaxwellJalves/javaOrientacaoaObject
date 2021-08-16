package com.java.poo.javapoo.domain.funcionario.model;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.Funcionario;

import java.math.BigDecimal;


public class Design extends Funcionario {

    public Design(String nome, BigDecimal salario, Departamento departamento, TempoDeCasa tempoDeCasa) {
        super(nome, salario, departamento, tempoDeCasa);
    }
}
