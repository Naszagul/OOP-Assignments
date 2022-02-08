package Shapes.SubShapes;

import Shapes.Shape;

public class Cone extends Shape {

    public double radius;
    public double baseArea = Math.PI * Math.pow(radius,2);
    public double volume = 1.0/3.0 * Math.PI * Math.pow(radius,2) * height;

    public Cone() {
        this.baseArea = 1;// todo
    }
}
