package coderiverside.dateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main7 {
    public static void main(String[] args) {

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

        // Example Thai numbers y Buddhist calendar
        Locale th = Locale.forLanguageTag("th-TH-u-ca-buddish-nu-thai");
        String formatted7 = zonedDateTime.
                format(DateTimeFormatter.
                        ofLocalizedDateTime(
                                FormatStyle.LONG
                        ).
                        withLocale(th)
                );
        System.out.println("Thai (Long) = " + formatted7);

        // En Java, un language tag es un string que identifica un language especifico
        // typicamente en el formato definido por BCP 47 (Best Current Practice 47).
        // Este formato es ampliamente usado por especificados languages de tal forma que
        // pueda ser entendido y procesado por computadoras

        // en -> English
        // en-US -> English (United States)
        // zh-Hans-CN -> Chinese, Simplified script, China
        // de-DE-u-co-phonebk -> German (Germany) with phonebook collation
        // zh-cmn-Hans-CN -> Mandarin Chinese, Simplified script, China

    }

}
