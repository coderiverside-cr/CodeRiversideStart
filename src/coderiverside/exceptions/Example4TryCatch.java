package coderiverside.exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class Example4TryCatch {

    private static Logger logger = Logger.getLogger(Example4TryCatch.class.getName());

    public static void main(String[] args) {
        try {
            doThings();
        } catch (NullPointerException | ArithmeticException e) {
            logger.info("A " + e.getMessage());
        } catch (NoSuchElementException e) {
            logger.info("B " + e.getMessage());
        } catch (IOException e) {
            logger.info("C " + e.getMessage());
        } catch (Exception e) {
            logger.info("D " + e.getMessage());
        } finally {
            logger.info("Finally");
        }
    }
    public static void doThings() throws IOException {
        Integer a = 25;
        Integer b = 0;
        Integer c = a / b;
    }
}
