package Shapes.SubShapes;

import Shapes.Shape;

public class Cylinder extends Shape {

    public double height;
    public double radius;
    public double baseArea = Math.PI * Math.pow(radius,2);
    public double volume = Math.PI * Math.pow(radius,2) * height;

    public Cylinder() {
        this.baseArea = 1;// todo
    }
}
