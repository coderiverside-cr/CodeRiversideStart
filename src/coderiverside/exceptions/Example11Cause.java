package coderiverside.exceptions;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example11Cause {
    private static Logger logger = Logger.getLogger(Example11Cause.class.getName());

    public static void main(String[] args) {
        try {
            readFile("nonexistent_file.txt");
        } catch (Exception e) {
            logger.severe("Exception caught: " + e.getMessage());
            Throwable cause = e.getCause();
            if (cause != null) {
                logger.log(Level.INFO, "Original cause: " + cause.getMessage(), e);
            }
        }
    }

    public static void readFile(String filePath) throws Exception {
        try {
            FileReader reader = new FileReader(filePath);
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            throw new Exception("Error reading file.", e);
        }
    }
}