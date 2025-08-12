package coderiverside.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BusinessPolicies.class) // Mark BusinessPolicy as repeatable and associate BusinessPolicies as the container
public @interface BusinessPolicy {
    String name();
    Severity level() default Severity.MEDIUM;

    enum Severity {
        LOW, MEDIUM, HIGH, CRITICAL
    }
}