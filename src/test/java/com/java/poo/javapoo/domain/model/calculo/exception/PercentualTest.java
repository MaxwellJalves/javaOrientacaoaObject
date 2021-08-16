package com.java.poo.javapoo.domain.model.calculo.exception;

import com.java.poo.javapoo.domain.calculo.Percentual;
import com.java.poo.javapoo.domain.calculo.exception.RegraPercentualPermitidoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PercentualTest {

    @Test
    void deve_retornar_exception_regra_percentual_permitido_exception_quando_for_informado_um_percentual_nao_predefinido(){
        Assertions.assertThrows(RegraPercentualPermitidoException.class, () -> Percentual.getPercentual(6));
    }
}
