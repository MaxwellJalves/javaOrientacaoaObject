package com.java.poo.javapoo.domain.funcionario.model;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.funcionario.Funcionario;

public class ServicosGerais extends Funcionario {

    public ServicosGerais(String nome, double salario, Departamento departamento) {
        super(nome, salario, departamento);
    }
}