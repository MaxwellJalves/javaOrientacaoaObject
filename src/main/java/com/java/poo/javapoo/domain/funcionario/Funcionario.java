package com.java.poo.javapoo.domain.funcionario;

import com.java.poo.javapoo.domain.calculo.Percentual;
import com.java.poo.javapoo.domain.enums.Departamento;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Funcionario {

    private String nome;
    private double salario;
    private Departamento departamento;
    private double tempoDeCasa;

    public Double setAumentoSalarial(){
        var percentual = Percentual.getPercentual(1);

        this.salario += (this.salario *  percentual) ;
        return  this.salario;
    }

}
