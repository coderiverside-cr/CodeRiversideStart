package coderiverside.dateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main6 {
    public static void main(String[] args) {

        // Deprecated
        Locale italy = new Locale("it");
        Locale esMex = new Locale("es", "MEX");

        Locale localeUs = Locale.US;
        Locale localeJp = Locale.JAPAN;

        Locale localeEn = Locale.of("en",
                "GB",
                "EURO");

        Locale localeFr = new Locale
                .Builder()
                .setLanguage("fr")
                .setRegion("CA")
                .build();

        System.out.println();

        LocalDateTime localDateTime = LocalDateTime.of(
                2024,
                4,
                7,
                13,
                25,
                17
        );

        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                localDateTime,
                ZoneId.of("US/Pacific")
        );

        String formatted = zonedDateTime.
                format(DateTimeFormatter.
                        ofLocalizedDateTime(
                                FormatStyle.LONG
                        ).
                        withLocale(italy)
                );
        System.out.println("Italy (Long) = " + formatted);

        String formatted2 = zonedDateTime.
                format(DateTimeFormatter.
                        ofLocalizedDateTime(
                                FormatStyle.FULL
                        ).
                        withLocale(esMex)
                );

        System.out.println("EsMex (Full) = " + formatted2);

        String formatted3 = zonedDateTime.
                format(DateTimeFormatter.
                        ofLocalizedDateTime(
                                FormatStyle.MEDIUM
                        ).
                        withLocale(localeUs)
                );

        System.out.println("Us (Medium) = " + formatted3);

        String formatted4 = zonedDateTime.
                format(DateTimeFormatter.
                        ofLocalizedDateTime(
                                FormatStyle.LONG
                        ).
                        withLocale(localeJp)
                );

        System.out.println("Japan (Long) = " + formatted4);

        String formatted5 = zonedDateTime.
                format(DateTimeFormatter.
                        ofLocalizedDateTime(
                                FormatStyle.LONG
                        ).
                        withLocale(localeEn)
                );

        System.out.println("En (Long) = " + formatted5);

        String formatted6 = zonedDateTime.
                format(DateTimeFormatter.
                        ofLocalizedDateTime(
                                FormatStyle.LONG
                        ).
                        withLocale(localeFr)
                );

        System.out.println("Fr (Long) = " + formatted6);
    }
}
