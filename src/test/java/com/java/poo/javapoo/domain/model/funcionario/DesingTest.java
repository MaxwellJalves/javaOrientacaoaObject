package com.java.poo.javapoo.domain.model.funcionario;

import com.java.poo.javapoo.domain.enums.Departamento;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import com.java.poo.javapoo.domain.funcionario.model.Design;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.math.BigDecimal;

public class DesingTest {

    @Test
    void deve_criar_um_funcionario_com_o_perfil_design() {
        Assertions.assertNotNull(getDesign());
    }

    @Test
    void deve_retornar_sucesso_para_analise_dos_campos_informados() {
        Assertions.assertEquals("ANA BEATRIZ", getDesign().getNome());
        Assertions.assertEquals(BigDecimal.valueOf(10000.00), getDesign().getSalario());
        Assertions.assertEquals("DESIGN", getDesign().getDepartamento().toString());
    }

    @Test
    void deve_restornar_assertionFailedError_quando_for_passado_o_a_referencia_do_departamento() {
        Assertions.assertThrows(AssertionFailedError.class, () -> {
            Assertions.assertEquals("DESIGN", getDesign().getDepartamento());
        });
    }

    public static Design getDesign() {
        var design = new Design(1l,"ANA BEATRIZ", BigDecimal.valueOf(10000.00), Departamento.DESIGN, TempoDeCasa.UM_ANO);
        return design;
    }
}
