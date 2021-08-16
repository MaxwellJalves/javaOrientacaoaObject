package com.java.poo.javapoo.domain.calculo;
/**
 * @description Retorna o percentual baseado no tempo de vinculo empregaticio do funcionário
 * */
public class Percentual {

    private Percentual(){

    }
    /**
     * Realizado a criação da regra que define o percentual permitido no sistema.*/
    public  static  Double getPercentual(int percentual){

        switch (percentual){
            case 1:
                return  0.01;
            case 2:
                return 0.02;
            case 3:
                return 0.03;
            case 4:
                return 0.035;
        }
        return null;
    }
}
