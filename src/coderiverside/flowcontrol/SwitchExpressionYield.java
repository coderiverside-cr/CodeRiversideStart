package coderiverside.flowcontrol;

public class SwitchExpressionYield {
    public static void main(String[] args) {

        System.out.println("getAnimal = " + getAnimal(4));
    }

    public static String getAnimal(int type) {
        String animal = switch (type) {
            case 0 -> "Lion";
            case 1 -> {
                    System.out.println("animal = " + type);
                    yield "Dumbo";
            }
            case 2, 3 -> "Alligator";
            case 4 -> throw new RuntimeException("Unsupported value");
            default -> "Unknown";
        };
        return animal;
    }
}
