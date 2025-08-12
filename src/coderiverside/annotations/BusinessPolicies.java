package coderiverside.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BusinessPolicies {
    BusinessPolicy[] value(); // The 'value' attribute is an array of the repeatable annotation
}