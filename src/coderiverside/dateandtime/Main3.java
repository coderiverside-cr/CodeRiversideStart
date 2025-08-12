package coderiverside.dateandtime;

import java.util.Date;

public class Main3 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);

        long milliseconds = date.getTime(); // epoch
        System.out.println("milliseconds = " + milliseconds);
        // El Epoch en Java se refiere al instante de tiempo 1970-01-01T00:00:00Z.
        // A partir del Epoch, los instantes de tiempo posteriores tendrán valores positivos,
        // mientras que los instantes anteriores tendrán valores negativos.
        // En otras palabras, el Epoch es un punto de referencia desde el cual se mide el tiempo.

        date.setTime(milliseconds + (1000 * 60));
        System.out.println("date = " + date);

    }
}
