package coderiverside.records;

import java.util.function.BiFunction;

public record Rectangle(double length, double width) {

//    // Field declarations must be static:
//    BiFunction<Double, Double, Double> diagonal;
//
//    // Instance initializers are not allowed in records:
//    {
//        diagonal = (x, y) -> Math.sqrt(x*x + y*y);
//    }

    record RotationAngle(double angle) {
        public RotationAngle {
            angle = Math.toRadians(angle);
        }
    }

    // Static field
    static double goldenRatio;

    // Static initializer
    static {
        goldenRatio = (1 + Math.sqrt(5)) / 2;
    }

    // Static method
    public static Rectangle createGoldenRectangle(double width) {
        return new Rectangle(width, width * goldenRatio);
    }

    public Rectangle {
        if (length <= 0 || width <= 0) {
            throw new java.lang.IllegalArgumentException(
                    String.format("Invalid dimensions: %f, %f", length, width));
        }
    }

    public double length() {
        System.out.println("Length is " + length);
        return length;
    }

    public double area() {
        return this.width * this.length;
    }

}