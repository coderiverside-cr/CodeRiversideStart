package coderiverside.exceptions;

import java.io.IOException;
import java.util.logging.Logger;

public class Example3Try {

    private static Logger logger = Logger.getLogger(Example3Try.class.getName());

    public static void main(String[] args){
        try {
            readFile(null);
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }

    public static void readFile(String filePath) throws IOException {
        if (filePath == null) {
            throw new IOException("The file path must not be null");
        }
        System.out.println("Reading File: " + filePath);
    }
}
