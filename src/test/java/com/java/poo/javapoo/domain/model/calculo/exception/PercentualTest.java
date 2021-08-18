package com.java.poo.javapoo.domain.model.calculo.exception;

import com.java.poo.javapoo.domain.calculo.Percentual;
import com.java.poo.javapoo.domain.calculo.exception.RegraPercentualPermitidoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PercentualTest {

    @Test
    void deve_retornar_dez_por_cento_quando_for_passado_o_valor_um(){
        assertEquals(0.01,Percentual.getPercentual(1));
    }

    @Test
    void deve_retornar_vinte_por_cento_quando_for_passado_o_valor_um(){
        assertEquals(0.02,Percentual.getPercentual(2));
    }

    @Test
    void deve_retornar_trinta_por_cento_quando_for_passado_o_valor_um(){
        assertEquals(0.03,Percentual.getPercentual(3));
    }

    @Test
    void deve_retornar_trinta_e_cinco_porcento_quando_for_passado_o_valor_quatro(){
        assertEquals(0.035,Percentual.getPercentual(4));
    }

    @Test
    void deve_retornar_regraPercentualPermitidoException_quando_nao_atender_a_regra_predefinida(){
        assertThrows(RegraPercentualPermitidoException.class, () -> Percentual.getPercentual(6));
    }
}
