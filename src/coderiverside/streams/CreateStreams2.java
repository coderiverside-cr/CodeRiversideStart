package coderiverside.streams;

import coderiverside.streams.*;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class CreateStreams2 {
    public static void main(String[] args) {
        Stream.of(new Food(), new Drink())
                .forEach(p->{
                    p.setPrice(BigDecimal.TEN);
                    System.out.println("p = " + p);
                });
    }
}
