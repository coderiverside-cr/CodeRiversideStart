package coderiverside.annotations;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main0 {
    public static void main(String[] args) {

        if (InfoService.class.isAnnotationPresent(Info.class)) {
            Info info = InfoService.class.getAnnotation(Info.class);
            System.out.println("Author: " + info.author());
            System.out.println("Version: " + info.version());
            System.out.println("Reviewers:");
            for (String reviewer : info.reviewers()) {
                System.out.println(" - " + reviewer);
            }
        }
    }
}