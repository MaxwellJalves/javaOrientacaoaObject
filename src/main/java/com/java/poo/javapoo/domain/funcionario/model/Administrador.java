package com.java.poo.javapoo.domain.funcionario.model;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.funcionario.Funcionario;



public class Administrador extends Funcionario {

    public Administrador(String nome, double salario, Departamento departamento, double tempoDeCasa) {
        super(nome, salario, departamento, tempoDeCasa);
    }
}
