package coderiverside.exceptions;

import java.io.IOException;
import java.util.Objects;

public class Example2 {
    public static void main(String[] args) throws IOException {
        readFile(null);
    }

    public static void readFile(String filePath) throws IOException{
        if (filePath == null) {
            throw new IOException("The file path must not be null");
        }
        // TODO: Code to read a file
        System.out.println("Reading File: " + filePath);
    }
}
