package coderiverside.inputoutput;

import java.io.*;

// BufferedInputStream
public class BinaryInputOutput2 {
    public static void main(String[] args) {
        try(
                InputStream in = new BufferedInputStream(new FileInputStream("source2.bin"));
                OutputStream out = new BufferedOutputStream(new FileOutputStream("destination2.bin"));
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
