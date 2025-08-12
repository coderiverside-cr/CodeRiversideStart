package coderiverside.inheritance;
//Utilizamos el keyword 'this' para hacer referencia a variables y métodos del objeto actual
//Utilizamos el keyword 'super' para hacer referencia a variables y métodos del objeto padre.

class Animal {
    public String name = "Animal";
}

class Dog extends Animal {
    private String name = "Dog";

    public void displayName() {
        System.out.println("Name from Dog: " + this.name);
        System.out.println("Name from Animal: " + super.name);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.displayName();
    }
}
