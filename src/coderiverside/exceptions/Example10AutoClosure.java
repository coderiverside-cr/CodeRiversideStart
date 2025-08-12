package coderiverside.exceptions;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example10AutoClosure {
    private static Logger logger = Logger.getLogger(Example10AutoClosure.class.getName());

    public static void main(String[] args) throws Exception {

        try (
            BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))
        ) {
            String line = reader.readLine();
            writer.write(line);
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "Error opening file", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error read-write", e);
        }
    }
}

