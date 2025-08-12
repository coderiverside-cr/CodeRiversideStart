package coderiverside.flowcontrol;

public class SwitchPatternMatchingGuard {
    public static void main(String[] args) {
        System.out.println("getTrainer = " + getTrainer(7));
        System.out.println("getTrainer = " + getTrainer(25.5));

        Number zooPatrons = Integer.valueOf(1_000);
        switch (zooPatrons) {
            case Integer count -> System.out.print("Welcome: " + count);
            case Double x -> System.out.print("Welcome: " + x);
            default -> throw new IllegalStateException("Unexpected value: " + zooPatrons);
        }

//        Number fish = 10;
//        String name = switch (fish) {
//            case Integer freshWater -> "Bass";
//            case Number saltWater   -> "ClownFish";
//            case String s           -> "Shark";  // DOES NOT COMPILE
//        };

        System.out.println();

        String fish = null;
        System.out.println(switch (fish) {
            case "ClownFish" -> "Hello!";
            case "BlueTang"  -> "Hello again!";
            case null        -> "What type of fish are you?";
            default          -> "Goodbye";
        });
    }

    public static String getTrainer(Number height) {
        return switch (height) {
            case Integer i when i > 10 -> "Joseph";
            case Integer i -> "Daniel";
            case Double num when num <= 15.5 -> "Peter";
            case Double num -> "Kelly";
            case Number num -> "Ralph";
        };
    }
}
