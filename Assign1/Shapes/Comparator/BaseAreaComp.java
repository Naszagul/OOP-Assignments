package Comparator;

import java.util.Comparator;
import Shapes.Shape;

public class BaseAreaComp implements Comparator<Shape> {

    @Override
    public int compare(Shape s1, Shape s2) {
        int result;
        result = s1.baseArea == s2.baseArea ? 0 : s1.baseArea > s2.baseArea ? 1 : -1;
        return result;
    }

}
