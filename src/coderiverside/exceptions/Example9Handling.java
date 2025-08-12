package coderiverside.exceptions;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example9Handling {
    private static Logger logger = Logger.getLogger(Example9Handling.class.getName());

    public static void main(String[] args) throws Exception {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            System.out.println("First line: " + reader.readLine());
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "Error opening file", e);
            return;
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading file", e);
            throw new Exception("Error reading file", e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                logger.log(Level.SEVERE, "Error closing file", e);
            }
        }
    }
}

