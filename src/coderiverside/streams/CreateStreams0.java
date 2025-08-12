package coderiverside.streams;

import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class CreateStreams0 {
    public static void main(String[] args) {
        IntStream.generate(new IntSupplier() {
                    @Override
                    public int getAsInt() {
                        return (int) (Math.random() * 10);
                    }
                })
                .peek(new IntConsumer() {
                    @Override
                    public void accept(int i) {
                        System.out.println("i = " + i);
                    }
                })
                .limit(5)
                .forEach(new IntConsumer() {
                    @Override
                    public void accept(int value) {
                        System.out.println("value = " + value);
                    }
                });

    }
}
