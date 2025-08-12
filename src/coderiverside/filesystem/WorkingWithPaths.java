package coderiverside.filesystem;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
/*
/users
    └── gabriel
        ├── docs
        │   ├── other.txt
        │   └── some.txt
        └── pics
            └── acme.jpg
*/
public class WorkingWithPaths {
    public static void main(String[] args) throws IOException {
        Path someFile = Path.of("/", "users", "gabriel", "docs", "some.txt");
        System.out.println("someFile = " + someFile);
        Path justSomeFile = someFile.getFileName();
        System.out.println("justSomeFile = " + justSomeFile);
        Path docsFolder = someFile.getParent();
        System.out.println("docsFolder = " + docsFolder);

        Path currentFolder = Path.of(".");
        System.out.println("currentFolder = " + currentFolder);

        Path acmeFile = docsFolder.resolve("../pics/acme.jpg");
        System.out.println("acmeFile = " + acmeFile);

        Path otherFile = someFile.resolveSibling("other.txt");
        System.out.println("otherFile = " + otherFile);

        Path normalizedAcmeFile = acmeFile.normalize();
        System.out.println("normalizedAcmeFile = " + normalizedAcmeFile);

        Path verifiedPath = acmeFile.toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println("verifiedPath = " + verifiedPath);

        Path betweenSomeAndAcme = someFile.relativize(acmeFile);
        System.out.println("betweenSomeAndAcme = " + betweenSomeAndAcme);
    }
}
