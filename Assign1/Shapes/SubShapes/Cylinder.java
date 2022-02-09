package Shapes.SubShapes;

import Shapes.Shape;

public class Cylinder extends Shape {

    public Cylinder(double newHeight, double newSideLengthRadius){
        this.height = newHeight;
        this.sideLengthRadius = newSideLengthRadius;
        this.baseArea = Math.PI * Math.pow(this.sideLengthRadius,2.0);
        this.volume = Math.PI * Math.pow(this.sideLengthRadius,2.0) * this.height;
    }
}
