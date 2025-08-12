package coderiverside.records;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0,4.0);
        System.out.println("rectangle = " + rectangle);
        System.out.println("rectangle.length() = " + rectangle.length());
        System.out.println("rectangle.width() = " + rectangle.width());

        Rectangle rectangle1 = Rectangle.createGoldenRectangle(5.0);
        System.out.println("rectangle1 = " + rectangle1);

        double area = rectangle1.area();
        System.out.println("area = " + area);

        Square<Double> square = new Square<>(5.0);
        System.out.println("square = " + square);

    }

}
