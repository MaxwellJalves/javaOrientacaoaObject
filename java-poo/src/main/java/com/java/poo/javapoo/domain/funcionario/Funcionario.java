package com.java.poo.javapoo.domain.funcionario;

import com.java.poo.javapoo.domain.enums.Departamento;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Funcionario {

    private String nome;
    private double salario;
    private Departamento departamento;

    public Double aumentoSalarial(double salarioAtual){
        return Double.valueOf(salarioAtual * 0.01);
    }

}
