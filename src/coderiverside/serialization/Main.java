package coderiverside.serialization;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(LocalDate.now());
        priceList.addItem(
                new Drink("Tea", BigDecimal.valueOf(1.7))
        );
        priceList.addItem(
                new Food("Pizza", BigDecimal.valueOf(2.5))
        );

        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("swap"))
        ) {
            out.writeObject(priceList);
        } catch (IOException e) {
            System.out.println("e = " + e);
        }

        System.out.println("priceList = " + priceList);
        priceList = null; // Cleaning the object reference
        System.out.println("priceList = " + priceList);

        try(
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("swap"))
        ){
            priceList = (PriceList)in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("e = " + e);
        } catch (IOException e) {
            System.out.println("e = " + e);
        } catch (ClassNotFoundException e){
            System.out.println("e = " + e);
        }

        System.out.println("priceList = " + priceList);


    }
}
