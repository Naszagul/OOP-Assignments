import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>, Comparator<Shape> {
    int height;
    int volume;
    int baseArea;

    @Override
    public int compareTo(Shape s) {
        return compare(this, s);
    }

    @Override
    public int compare(Shape s1, Shape s2) {
        int result;
        result = s1.baseArea == s2.baseArea ? 0 : s1.baseArea > s2.baseArea ? 1 : -1;
        return result;
    }
}