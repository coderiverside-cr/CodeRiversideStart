package coderiverside.dateandtime;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate other = LocalDate.of(2024, Month.MARCH, 1);

        Period howLong = Period.between(other, now);
        System.out.println("howLong = " + howLong);

        //Formato: “PnYnMnD” (por ejemplo, “P2Y10D” para 2 años y 10 días).

        int days = howLong.getDays();
        System.out.println("days = " + days);

        int months = howLong.getMonths();
        System.out.println("months = " + months);

        Instant timeStamp = Instant.now();
        System.out.println("timeStamp = " + timeStamp);

        int nanoSecondFromLastSecond = timeStamp.getNano();
        System.out.println("nanoSecondFromLastSecond = " + nanoSecondFromLastSecond);


        Duration duration = Duration.ofHours(48);
        System.out.println("duration = " + duration);

        long seconds = duration.minusMinutes(25).getSeconds();
        System.out.println("seconds = " + seconds);

        // PdDThHmMs.sS donde h representa el valor de horas,
        // d representa el valor de lo días
        // m representa el valor de minutos y
        // s representa el valor de segundos.
        // Si alguna unidad tiene un valor de cero, se omite.

        Duration parsed = Duration.parse("P4DT20.345S");
        System.out.println("parsed = " + parsed);


    }
}
