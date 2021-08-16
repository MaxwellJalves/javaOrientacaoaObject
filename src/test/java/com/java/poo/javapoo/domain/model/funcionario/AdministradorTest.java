package com.java.poo.javapoo.domain.model.funcionario;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.model.Administrador;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


public class AdministradorTest {

    @Test
    void deve_criar_um_funcionario_com_o_perfil_administrador(){
        assertNotNull(getAdministrador());
    }

    @Test
    void deve_retornar_sucesso_para_analise_dos_campos_informados(){
        assertEquals("JOAO ALMEIDA", getAdministrador().getNome());
        assertEquals(3000.00, getAdministrador().getSalario());
        assertEquals("ADMINISTRATIVO", getAdministrador().getDepartamento().toString());
    }

    @Test
    void deve_retornar_sucesso_pois_a_referencia_retornada_e_diferente_da_string_esperada(){
        assertNotEquals("ADMINISTRATIVO", getAdministrador().getDepartamento());//NOSONAR
    }

    public static Administrador getAdministrador(){
        Administrador administrador = new Administrador("JOAO ALMEIDA", BigDecimal.valueOf(3000.00), Departamento.ADMINISTRATIVO, TempoDeCasa.DOIS_ANOS_OU_MAIS);
        return administrador;
    }
}
