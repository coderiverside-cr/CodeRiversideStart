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
public class AnalysePathProperties {
    public static void main(String[] args) throws IOException {

        Path p1 = Path.of("/users/gabriel/docs/some.txt"); // Absolute path
        Path p2 = Path.of("./docs/some.txt"); // Relative path
        Path p3 = Path.of("./pics/s.txt"); // Symbolic link

        FileSystem fs = p1.getFileSystem();
        System.out.println("fs = " + fs);
        Set<String> fsTypes = fs.supportedFileAttributeViews();
        System.out.println("fsTypes = " + fsTypes);

        Files.isDirectory(p1); // false
        Files.isExecutable(p1);  // false
        Files.isHidden(p1);  // false
        Files.isReadable(p1); // true
        Files.isWritable(p1); // true
        Files.isRegularFile(p1); // true
        Files.isSymbolicLink(p1);

        Files.probeContentType(p1);  // text.plain
        PosixFileAttributes paf = Files.readAttributes(p1, PosixFileAttributes.class);
        System.out.println("size = " + paf.size());
        System.out.println("creationTime = " + paf.creationTime());
        System.out.println("lastModifiedTime = " + paf.lastModifiedTime());
        System.out.println("lastAccessTime = " + paf.lastAccessTime());

        FileTime fileTime = paf.creationTime();
        Instant instant = fileTime.toInstant();
        FileTime fileTime2 = FileTime.from(Instant.now());

        UserPrincipal user = paf.owner();
        GroupPrincipal group = paf.group();

        Set<PosixFilePermission> permission = paf.permissions();
        System.out.println("permission = " + permission);
        System.out.println("permission = " + PosixFilePermissions.toString(permission));





    }
}
