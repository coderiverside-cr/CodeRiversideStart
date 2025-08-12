package coderiverside.wrapperclasses;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int a = 42;
        short w = 10;
        // Podemos crear un Wrapper Object a partir de un primitivo o String con el método valueOf()
        Integer b = Integer.valueOf(a);
        Short x = Short.valueOf((short) (w + 1));

        // Podemos extraer valores primitivos fuera de los Wrapper usando los métodos xxxValue().
        int c = b.intValue();
        short y = x.shortValue();

        // En lugar de una conversión formal de Wrapper a primitivo y viceversa
        // podemos usar la asignación directa conocida como auto-boxing y auto-unboxing.
        b = a;  // auto-boxing
        c = b;  // auto-unboxing

        String d = "12.25";
        // Podemos crear un Primitivo a partir de un String usando parseXXX().
        float f = Float.parseFloat(d);

        // Podemos Convertir un primitivo a un String usando el método String.valueOf()
        String g = String.valueOf(a);

        // Las Wrapper Classes proveen constantes como min y max. Para cada tipo
        short minValue = Short.MIN_VALUE;
        short maxValue = Short.MAX_VALUE;

        // Podemos usar valores null
        Short z = null;

        // Son requeridas para colecciones
        Set<Long> set = new HashSet<>();

    }

}
