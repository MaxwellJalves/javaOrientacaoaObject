package com.java.poo.javapoo.domain.funcionario.usecase;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.funcionario.model.Administrador;
import com.java.poo.javapoo.domain.funcionario.model.Design;
import com.java.poo.javapoo.domain.funcionario.model.Gerente;
import com.java.poo.javapoo.domain.funcionario.model.ServicosGerais;

public class SalvarFuncionario {

    public static void main(String[] args) {
        Administrador adm = new Administrador("MAXWELL",5000.00, Departamento.ADMINISTRATIVO);
        System.out.println(adm.toString());
        var salarioAtual = adm.getSalario() + adm.aumentoSalarial(adm.getSalario());
        System.out.println("Salario Anterior : \t" +adm.getSalario());
        System.out.println("Salario Atual    : \t" +salarioAtual);

        Design design = new Design("ZEFINHA MARTINS",2000.00,Departamento.DESIGN);
        var salarioDesign = design.aumentoSalarial(design.getSalario()) + design.getSalario();
        System.out.println(design.toString());
        System.out.println("Salario Anterior : \t" +design.getSalario());
        System.out.println("Salario Atual    : \t" +salarioDesign);



        ServicosGerais sg = new ServicosGerais("CLAUDIO NUNES",1800.50,Departamento.SERVICOS_GERAIS);
        System.out.println(sg.toString());

    }
}
