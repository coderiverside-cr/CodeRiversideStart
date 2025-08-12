package coderiverside.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        LocalTime thisTime = LocalTime.now();
        System.out.println("thisTime = " + thisTime);

        // format ISO-8601 yyyy-MM-ddTHH:mm:ss.SSSSSSSSS
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime);

        LocalDate someDay = LocalDate.of(2021, Month.FEBRUARY, 25);
        System.out.println("someDay = " + someDay);

        LocalTime someTime = LocalTime.of(17, 25);
        System.out.println("someTime = " + someTime);

        LocalDateTime localDateTime = LocalDateTime.of(2019,
                Month.JULY,
                17,
                4,
                7);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime atTime = someDay.atTime(someTime);
        System.out.println("atTime = " + atTime);

        LocalDate theDate = localDateTime.toLocalDate();
        System.out.println("theDate = " + theDate);

    }
}
