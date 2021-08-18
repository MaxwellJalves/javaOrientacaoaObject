package com.java.poo.javapoo.domain.funcionario.model;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.Funcionario;

import java.math.BigDecimal;

public class Gerente extends Funcionario {

    public Gerente(Long id,String nome, BigDecimal salario, Departamento departamento, TempoDeCasa tempoDeCasa) {
        super(id,nome, salario, departamento, tempoDeCasa);
    }
}
