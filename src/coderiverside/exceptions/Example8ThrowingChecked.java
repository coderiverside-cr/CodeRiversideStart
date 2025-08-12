package coderiverside.exceptions;

import java.nio.file.NoSuchFileException;
import java.util.Objects;

public class Example8ThrowingChecked {

    public static void main(String... args) {
        try {
            openFile(null);
        } catch (NoSuchFileException e) {
            System.out.println("e = " + e);
        } finally {
            System.out.println("End!!!");
        }
    }

    public static void openFile(String fileName) throws NoSuchFileException {
        if(Objects.isNull(fileName)){
            throw new NoSuchFileException("File name must be set");
        }
    }
}
