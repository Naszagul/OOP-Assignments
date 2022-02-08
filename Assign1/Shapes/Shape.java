package Shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>, Comparator<Shape> {
    public double height;
    public double volume;
    public double baseArea;

    @Override
    public double compareTo(Shape s) {
        return compare(this, s);
    }

}