package coderiverside.flowcontrol;

public class SwitchArrow {
    public static void main(String[] args) {

        System.out.println("getAnimal = " + getAnimal(2));
    }

    public static String getAnimal(int type) {
        String animal = switch (type) {
            case 0 -> "Lion";
            case 1 -> "Elephant";
            default -> "Unknown";
            case 2, 3 -> "Alligator";
            case 4 -> "Crocodile";
        };
        return animal;
    }
}
