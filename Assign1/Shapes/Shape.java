package Shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>, Comparator<Shape> {
    public int height;
    public int volume;
    public int baseArea;

    @Override
    public int compareTo(Shape s) {
        return compare(this, s);
    }

}