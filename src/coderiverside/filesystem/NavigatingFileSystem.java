package coderiverside.filesystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

/*
/users
└── gabriel
    ├── docs
    │         ├── other.txt
    │         └── some.txt
    └── pics
        └── acme.jpg
*/
public class NavigatingFileSystem {
    public static void main(String[] args) throws IOException {
        Path gabriel = Path.of("/", "users", "gabriel");
        Path path1 = Path.of("/", "users", "gabriel", "docs", "some.txt");
        for (int i = 0; i < path1.getNameCount(); i++) {
            Path p = path1.getName(i);
            System.out.println("p = " + p);
        }
        Path path2 = Path.of("/", "users", "gabriel","pics","s.txt");
        //Files.createSymbolicLink(path2, path1);
        Files.list(gabriel)
                .forEach(p -> System.out.println("p = " + p));
        Files.walk(gabriel)
                .map(p ->p.toString())
                .filter(s -> s.endsWith("txt"))
                .forEach(p -> System.out.println("p = " + p));

        Path path3 = Files.readSymbolicLink(path2);
        System.out.println("path3 = " + path3);
    }
}
