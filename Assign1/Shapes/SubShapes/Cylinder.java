package Shapes.SubShapes;

import Shapes.Shape;

public class Cylinder extends Shape {

    public Cylinder(String newTitle, double newHeight, double newSideLengthRadius) {
        this.title = newTitle;
        this.height = newHeight;
        this.sideLengthRadius = newSideLengthRadius;
        this.baseArea = Math.PI * Math.pow(this.sideLengthRadius, 2.0);
        this.volume = Math.PI * Math.pow(this.sideLengthRadius, 2.0) * this.height;
    }

    @Override
    public int compare(Shape o1, Shape o2) {
        // TODO Auto-generated method stub
        return 0;
    }
}