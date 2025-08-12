package coderiverside.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyAndMovePaths {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("/", "users", "gabriel", "docs");
        Path backup = Path.of("/", "tmp", "backup");
        Path archive = Path.of("/", "tmp", "archive");
        if (Files.notExists(backup)) {
            Files.createDirectories(backup);
        }
        if (Files.notExists(archive)) {
            Files.createDirectories(archive);
        }

        Files.list(source)
                .forEach(file -> {
                    Path resolved = backup.resolve(file.getFileName());
                    System.out.println("resolved = " + resolved);
                    try {
                        Files.copy(
                                file,
                                resolved,
                                StandardCopyOption.COPY_ATTRIBUTES,
                                StandardCopyOption.REPLACE_EXISTING
                        );
                    } catch (IOException e) {
                        System.out.println("e = " + e);
                    }
                });

        Files.move(
                backup,
                archive,
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.ATOMIC_MOVE
                );

    }
}
