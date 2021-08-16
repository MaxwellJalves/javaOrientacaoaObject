package com.java.poo.javapoo.domain.model.calculo.exception;

import com.java.poo.javapoo.domain.calculo.ReajusteSalarial;
import com.java.poo.javapoo.domain.calculo.exception.RegraSalarialException;
import com.java.poo.javapoo.domain.enums.TempoDeCasa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class RegraSalarialExceptionTest {

    @Test
    void deve_retornar_regra_salarial_exception_quando_tentar_aplicar_um_aumento_salarial_para_um_funcionario_com_menos_de_seis_meses(){

       var reajuste = new ReajusteSalarial();

        Assertions.assertThrows(RegraSalarialException.class,() -> reajuste.aplicarReajusteSalarial(BigDecimal.valueOf(1000.00),TempoDeCasa.MENOS_DE_SEIS_MESES));
    }
}
