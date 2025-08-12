package coderiverside.filesystem;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class WorkingWithFileSystem {
    public static void main(String[] args) {
        // java.io.File Legacy
        FileSystem fs = FileSystems.getDefault();
        System.out.println("fs = " + fs);

        fs.getFileStores().forEach(
                s -> {
                    try {
                        System.out.println(
                                "FileStore: " + s.type()
                                        + " " + s.name()
                                        + " Space: "
                                        + s.getTotalSpace()
                                        + " " + s.getUsableSpace());
                    } catch (IOException e) {
                        System.out.println("e = " + e);
                    }

                }
        );

        fs.getRootDirectories().forEach(
                p -> {
                    System.out.println("RD:" + p);
                }
        );

        String separator = fs.getSeparator();
        System.out.println("separator = " + separator);
    }
}
