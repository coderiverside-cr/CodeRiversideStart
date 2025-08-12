package coderiverside.records;

import java.util.Objects;

public final class Recatangle {
    private final double width;
    private final double length;

    public Recatangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double width() {
        return width;
    }

    public double length() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Recatangle) obj;
        return Double.doubleToLongBits(this.width) == Double.doubleToLongBits(that.width) &&
                Double.doubleToLongBits(this.length) == Double.doubleToLongBits(that.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public String toString() {
        return "Recatangle[" +
                "width=" + width + ", " +
                "length=" + length + ']';
    }

}
