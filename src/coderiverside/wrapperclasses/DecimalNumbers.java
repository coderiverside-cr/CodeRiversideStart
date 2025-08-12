package coderiverside.wrapperclasses;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalNumbers {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        System.out.println(sum);    // Resultado: 0.30000000000000004

        double small = 1.0;
        double large = 1.0E15;
        double total = small + large;
        System.out.println(total);  // Resultado: 1.000000000000001E15 (no se suma el valor pequeño)

        BigDecimal bda = new BigDecimal("0.1");
        BigDecimal bdb = BigDecimal.valueOf(0.2);
        BigDecimal bdsum = bda.add(bdb);
        System.out.println("bdsum = " + bdsum);

        BigDecimal bds = new BigDecimal("1.0");
        BigDecimal bdl = BigDecimal.valueOf (1.0E15);
        BigDecimal bdt = bds.add(bdl);
        System.out.println("bdt = " + bdt);

        char[] charArray = {'1', '2', '3', '.', '4', '5', '6'};
        BigDecimal bdchar = new BigDecimal(charArray);
        System.out.println("bdchar = " + bdchar);

        BigDecimal bd0 = new BigDecimal("-1");
        BigDecimal bd1 = BigDecimal.valueOf (-0.5);
        BigDecimal bd2 = BigDecimal.valueOf (1.1);

        BigDecimal bd3 = bd0.multiply(bd1).add(bd2).setScale(1, RoundingMode.UP);
        System.out.println("bd3 = " + bd3); // bd3 = 1.6

        BigDecimal bd4 = bd3.setScale(0, RoundingMode.UP);
        System.out.println("UP = " + bd4);

        BigDecimal bd5 = bd3.setScale(0, RoundingMode.CEILING);
        System.out.println("CEILING = " + bd5);

        BigDecimal bd6 = bd3.setScale(0, RoundingMode.DOWN);
        System.out.println("DOWN = " + bd6);

        BigDecimal bd7 = bd3.setScale(0, RoundingMode.FLOOR);
        System.out.println("FLOOR = " + bd7);

        BigDecimal bd8 = bd3.setScale(0, RoundingMode.HALF_DOWN);
        System.out.println("HALF_DOWN = " + bd8);

        BigDecimal bd9 = bd3.setScale(0, RoundingMode.HALF_EVEN);
        System.out.println("HALF_EVEN = " + bd9);

        BigDecimal bd10 = bd3.setScale(0, RoundingMode.HALF_UP);
        System.out.println("HALF_UP = " + bd10);

        BigDecimal bd11 = bd3.setScale(0, RoundingMode.UNNECESSARY);
        System.out.println("UNNECESSARY = " + bd11);

//        CEILING Redondea hacia el infinito positivo.
//        DOWN Redondea hacia cero.
//        FLOOR Redondea hacia el infinito negativo.
//        HALF_DOWN Redondea hacia el vecino más cercano, hacia abajo si ambos vecinos están a la misma distancia.
//        HALF_EVEN Redondea hacia el vecino más cercano o hacia el vecino par si ambos están a la misma distancia.
//        HALF_UP Redondea hacia el vecino más cercano o hacia arriba si ambos vecinos están a la misma distancia.
//        UNNECESSARY Asegura que la operación solicitada tenga un resultado exacto, por lo que no se necesita redondeo.
//        UP Redondea alejándose de cero.
    }
}
