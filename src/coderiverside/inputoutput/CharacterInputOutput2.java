package coderiverside.inputoutput;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

// File Reader
public class CharacterInputOutput2 {
    public static void main(String[] args) {
        Charset utf8 = StandardCharsets.UTF_8;
        try (
                Reader in = new BufferedReader(new FileReader("source2.txt", utf8));
                Writer out = new BufferedWriter(new FileWriter("destination2.txt", utf8));
        ) {
            char[] buffer = new char[1024];
            int length = 0;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
