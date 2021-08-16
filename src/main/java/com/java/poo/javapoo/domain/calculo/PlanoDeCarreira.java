package com.java.poo.javapoo.domain.calculo;

import com.java.poo.javapoo.domain.enums.TempoDeCasa;

import java.math.BigDecimal;

public interface PlanoDeCarreira {

    BigDecimal aplicarReajusteSalarial(BigDecimal salarioAtual, TempoDeCasa tempoDeCasa);
}
