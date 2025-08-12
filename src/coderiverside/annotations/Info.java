package coderiverside.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)              // Annotation is available at runtime
@Target(ElementType.TYPE)                         // Can be used only on classes, interfaces, etc.
public @interface Info {
    String author();                              // Required
    String[] reviewers() default {};              // Optional
    int version();                                // Required
}

