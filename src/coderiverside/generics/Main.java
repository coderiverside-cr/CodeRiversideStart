package coderiverside.generics;

public class Main {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox(5);
        System.out.println("integerBox.getValue() = " + integerBox.getValue());

        FloatBox floatBox = new FloatBox(12.5F);
        System.out.println("floatBox.getValue() = " + floatBox.getValue());

        ObjectBox objectBox = new ObjectBox(25);
        ObjectBox objectBox1 = new ObjectBox("Hola");
        ObjectBox objectBox2 = new ObjectBox(new Book("Code"));

        int value = (int) objectBox.getValue();
        String value1 = (String) objectBox1.getValue();
        Book value2 = (Book) objectBox2.getValue();

        if(objectBox.getValue() instanceof Integer){
            int valueI = (int) objectBox.getValue();
        }

        // Pattern Matching For instanceof Java 17
        if(objectBox.getValue() instanceof Integer valueI){
            System.out.println("valueI = " + valueI);
        }

        System.out.println();

        Box<Integer> box = new Box<>(25);
        System.out.println("box.getValue() = " + box.getValue());

        Box<String> box1 = new Box<>("Hola");
        System.out.println("box1.getValue() = " + box1.getValue());

//        Box<int> box2 = new Box<int>();
        // Integer -> int
        // Character -> char
        // Double -> double

    }
}
