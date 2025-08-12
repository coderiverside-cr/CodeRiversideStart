package coderiverside.optional;

import java.util.Optional;

// Don’t use isPresent()-get() if you want to perform an action
// only when an Optional value is present.
public class Main7 {
    public static void main(String[] args) {
        Optional<String> cr = Optional.of("CodeRiverside");
//        if (cr.isPresent()) {
//            System.out.println(cr.get().length());
//        }
        cr.ifPresent(s -> System.out.println(s.length()));

    }

}
