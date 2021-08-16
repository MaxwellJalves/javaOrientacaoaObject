package com.java.poo.javapoo.domain.model;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.funcionario.model.Administrador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class AdministradorTest {

    @Test
    void deve_criar_um_funcionario_com_o_perfil_gerente(){
        Assertions.assertNotNull(getGerente());
    }

    @Test
    void deve_retornar_sucesso_para_analise_dos_campos_informados(){
        Assertions.assertEquals("JOAO ALMEIDA",getGerente().getNome());
        Assertions.assertEquals(3000.00,getGerente().getSalario());
        Assertions.assertEquals("ADMINISTRATIVO",getGerente().getDepartamento().toString());
    }

    @Test
    void deve_restornar_assertionFailedError_quando_for_passado_o_a_referencia_do_departamento(){
        Assertions.assertThrows(AssertionFailedError.class, () ->{
            Assertions.assertEquals("ADMINISTRATIVO" ,getGerente().getDepartamento());} );
    }

    public static Administrador getGerente(){
        Administrador administrador = new Administrador("JOAO ALMEIDA", 3000.00, Departamento.ADMINISTRATIVO);
        return administrador;
    }
}
