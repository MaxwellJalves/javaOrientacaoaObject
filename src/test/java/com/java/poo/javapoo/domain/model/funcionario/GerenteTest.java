package com.java.poo.javapoo.domain.model.funcionario;


import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.model.Gerente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;

public class GerenteTest {

    @Test
    void deve_criar_um_funcionario_com_o_perfil_gerente(){
        Assertions.assertNotNull(getGerente());
    }

    @Test
    void deve_retornar_sucesso_para_analise_dos_campos_informados(){
    Assertions.assertEquals("ANA BEATRIZ",getGerente().getNome());
        Assertions.assertEquals(BigDecimal.valueOf(10000.00),getGerente().getSalario());
        Assertions.assertEquals("GERENCIA",getGerente().getDepartamento().toString());
    }

    @Test
    void deve_restornar_assertionFailedError_quando_for_passado_o_a_referencia_do_departamento(){
        Assertions.assertThrows(AssertionFailedError.class, () ->{
            Assertions.assertEquals("GERENTE" ,getGerente().getDepartamento());} );
    }

    public static Gerente getGerente(){
        Gerente gerente = new Gerente("ANA BEATRIZ", BigDecimal.valueOf(10000.00), Departamento.GERENCIA, TempoDeCasa.UM_ANO);
        return gerente;
    }
}
