package com.java.poo.javapoo.domain.funcionario;

import com.java.poo.javapoo.domain.calculo.ReajusteSalarial;
import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public abstract class Funcionario extends ReajusteSalarial {

    private String nome;
    private BigDecimal salario;
    private Departamento departamento;
    private TempoDeCasa tempoDeCasa;
}
