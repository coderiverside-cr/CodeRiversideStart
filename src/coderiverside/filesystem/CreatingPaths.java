package coderiverside.filesystem;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

public class CreatingPaths {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("/users/gabriel/docs");
        Path backup = Path.of("/tmp/backup/docs");

        if(Files.notExists(backup)){
            Files.createDirectories(backup);
        }

        Path readme = backup.resolve("readme.txt").normalize();
        System.out.println("readme = " + readme);
//        Files.createFile(readme);
//        Files.writeString(readme, "Backup time: " + Instant.now());
        Files.lines(readme, Charset.forName("UTF-8"))
                .forEach(line-> System.out.println("line = " + line));
        Files.deleteIfExists(readme);
        Files.deleteIfExists(backup);
    }
}
