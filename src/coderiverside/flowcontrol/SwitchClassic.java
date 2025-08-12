package coderiverside.flowcontrol;

public class SwitchClassic {
    public static void main(String[] args) {
        System.out.println("getAnimal = " + getAnimal(2));
    }

    public static String getAnimal(int type) {
        String animal;
        switch (type) {
            case 0:
                animal = "Lion";
                break;
            case 1:
                animal = "Elephant";
                break;
            case 2:
            case 3:
                animal = "Alligator";
                System.out.println("animal = " + animal);
            case 4:
                animal = "Crocodile";
                break;
            default:
                animal = "Unknown";
                break;
        }
        return animal;
    }
}
