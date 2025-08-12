package coderiverside.flowcontrol;

public class SwitchExpression {
    public static void main(String[] args) {

        System.out.println("getAnimal(4) = " + getAnimal(4));
    }



    public static String getAnimal(int type) {
        String animal = switch (type) {
            case 0 -> "Lion";
            case 1 -> "Elephant";
            case 2, 3 -> "Alligator";
            case 4 -> "Crocodile";
            default -> "Unknown";
        };
        return animal;
    }

}
