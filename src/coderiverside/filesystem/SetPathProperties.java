package coderiverside.filesystem;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.*;
import java.time.Instant;
import java.util.Set;
/*
/users
└── gabriel
    ├── docs
    │         ├── other.txt
    │         └── some.txt
    └── pics
        └── acme.jpg
*/
public class SetPathProperties {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/users/gabriel/docs/some.txt"); // Absolute path
        Files.setLastModifiedTime(path, FileTime.from(Instant.now()));
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
        Files.setPosixFilePermissions(path,permissions);

        PosixFileAttributeView fav = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        System.out.println("fav = " + fav.readAttributes().permissions());



    }
}
