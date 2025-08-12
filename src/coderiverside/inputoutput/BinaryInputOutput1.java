package coderiverside.inputoutput;

import java.io.*;
// File Input Stream
public class BinaryInputOutput1 {
    public static void main(String[] args) {
        try(
                InputStream in = new FileInputStream("source.bin");
                OutputStream out = new FileOutputStream("destination.bin")
                ){
            byte[] buffer = new byte[4096];
            int length = 0;
            while((length = in.read(buffer)) != -1){
                out.write(buffer, 0, length);
            }
        } catch (IOException e){
            System.out.println("e = " + e);
        }
    }
}
