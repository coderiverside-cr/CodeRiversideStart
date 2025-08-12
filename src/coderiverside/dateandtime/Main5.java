package coderiverside.dateandtime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main5 {
    public static void main(String[] args) {
        ZoneId.of("America/Los_Angeles");
        ZoneId.of("GMT-4");
        ZoneId.of("UTC-05:00");
        ZoneId.systemDefault();

        ZoneId london = ZoneId.of("Europe/London");
        ZoneId la = ZoneId.of("America/Los_Angeles");

        LocalDateTime localDateTime = LocalDateTime.of(
                2019,
                Month.JULY,
                17,
                4,
                47
        );

        ZonedDateTime londonTime = ZonedDateTime.of(localDateTime, london);
        System.out.println("londonTime = " + londonTime);

        ZonedDateTime laTime = londonTime.withZoneSameInstant(la);
        System.out.println("laTime = " + laTime);

        /*
        El método withZoneSameInstant es un método proporcionado por la clase ZonedDateTime en Java
        que permite cambiar la zona horaria de una fecha y hora manteniendo el mismo instante exacto
        en el tiempo.
        Esto significa que el método ajustará la representación de la fecha y hora para reflejar
        el mismo momento en el tiempo, pero en una zona horaria diferente.
        */
    }
}
