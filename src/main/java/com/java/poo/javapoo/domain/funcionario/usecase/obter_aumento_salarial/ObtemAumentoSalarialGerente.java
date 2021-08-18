package com.java.poo.javapoo.domain.funcionario.usecase.obter_aumento_salarial;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.Funcionario;
import com.java.poo.javapoo.domain.funcionario.model.Administrador;
import com.java.poo.javapoo.domain.funcionario.model.Gerente;
import com.java.poo.javapoo.domain.gatway.FuncionarioGatway;
import com.sun.jdi.request.InvalidRequestStateException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ObtemAumentoSalarialGerente {

    private  FuncionarioGatway gatway;
    private static List<Funcionario> dbFuncionarios = new ArrayList<>();
    static{
        dbFuncionarios.add(new Administrador(1l,"JOAO ALMEIDA", BigDecimal.valueOf(3000.00), Departamento.ADMINISTRATIVO, TempoDeCasa.DOIS_ANOS_OU_MAIS));
        dbFuncionarios.add(new Gerente(2l,"JOAO ALMEIDA", BigDecimal.valueOf(3000.00), Departamento.GERENCIA, TempoDeCasa.DOIS_ANOS_OU_MAIS));
    }

    public ObtemAumentoSalarialGerente() {
    }

    public Funcionario obterFuncionar(BaseRequest base){
        return dbFuncionarios.stream()
                             .filter( p -> p.getId() == base.getId())
                             .findFirst().orElseThrow(IllegalArgumentException::new);
    }
    /**FIXME Converter em teste de Unidade*/
    public static void main(String[] args) {
        ObtemAumentoSalarialGerente g = new ObtemAumentoSalarialGerente();
        System.out.println(g.obterFuncionar(BaseRequest.builder().id(1L).build()));
    }
}
