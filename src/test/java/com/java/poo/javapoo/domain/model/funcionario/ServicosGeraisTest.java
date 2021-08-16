package com.java.poo.javapoo.domain.model.funcionario;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.model.ServicosGerais;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;

public class ServicosGeraisTest {

    @Test
    void deve_criar_um_funcionario_com_o_perfil_servicos_gerais(){
        Assertions.assertNotNull(getServicosGerais());
    }

    @Test
    void deve_retornar_sucesso_para_analise_dos_campos_informados(){
        Assertions.assertEquals("MAXWELL", getServicosGerais().getNome());
        Assertions.assertEquals(2222.00, getServicosGerais().getSalario());
        Assertions.assertEquals("SERVICOS_GERAIS", getServicosGerais().getDepartamento().toString());
    }

    @Test
    void deve_restornar_assertionFailedError_quando_for_passado_o_a_referencia_do_departamento(){
        Assertions.assertThrows(AssertionFailedError.class, () ->{
            Assertions.assertEquals("SERVICOS_GERAIS" , getServicosGerais().getDepartamento());} );
    }

    public static ServicosGerais getServicosGerais(){
        var sg = new ServicosGerais("MAXWELL", BigDecimal.valueOf(2222.00), Departamento.SERVICOS_GERAIS, TempoDeCasa.UM_ANO);
        return sg;
    }
}
