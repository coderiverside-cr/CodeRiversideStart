package coderiverside.inputoutput;

import java.io.*;

// DataOutputStream
public class BinaryInputOutput3 {
    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("source3.bin"))) {
            dos.writeInt(42); // Escribe un entero
            dos.writeDouble(3.14159); // Escribe un double
            dos.writeBoolean(true); // Escribe un booleano
        } catch (IOException e) {
            System.out.println("e = " + e);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("source3.bin"))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            System.out.println("source: " + intValue + ", " + doubleValue + ", " + booleanValue);
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
