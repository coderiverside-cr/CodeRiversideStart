package coderiverside.inputoutput;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

// File Reader
public class CharacterInputOutput1 {
    public static void main(String[] args) {
        Charset utf8 = StandardCharsets.UTF_8;
        try (
                Reader in = new FileReader("source.txt", utf8);
                Writer out = new FileWriter("destination.txt", utf8);
        ) {
            char[] buffer = new char[1024];
            int length = 0;
            while((length = in.read(buffer)) != -1 ){
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
