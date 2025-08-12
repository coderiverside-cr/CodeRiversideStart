package coderiverside.inputoutput;

import java.io.*;

// InputStreamReader
public class CharacterInputOutput3 {
    public static void main(String[] args) {
        
        try (
                InputStreamReader reader = new InputStreamReader(new FileInputStream("source4.bin"), "UTF-8");
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("destination4.bin"), "UTF-8")
        ) {
            char[] buffer = new char[1024]; // Buffer de caracteres
            int charsRead;
            while ((charsRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charsRead);
            }
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
