package com.java.poo.javapoo.domain.funcionario.model;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.funcionario.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;



public class Administrador extends Funcionario {

    public Administrador(String nome, double salario, Departamento departamento) {
        super(nome, salario, departamento);
    }
}
