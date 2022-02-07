package Shapes;

import Shapes.*;
import Shapes.Comparator.*;

public class Prism extends Shape {
    public double side;

    public int compareTo(Shape s) {
        return compare(this, s);
    }

}