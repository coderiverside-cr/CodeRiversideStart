package coderiverside.dateandtime;

import java.time.LocalDateTime;

public class Main2 {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current = " + current);

        LocalDateTime other = current.withMinute(17).withDayOfMonth(7).plusHours(25);
        System.out.println("other = " + other);

        int year = current.getYear();
        System.out.println("year = " + year);

        boolean before = current.isBefore(other);
        System.out.println("before = " + before);

    }
}
