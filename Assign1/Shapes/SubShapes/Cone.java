package Shapes.SubShapes;

import Shapes.Shape;

public class Cone extends Shape {

    public Cone (String newTitle, double newHeight, double newSideLengthRadius){
        this.title = newTitle;
        this.height = newHeight;
        this.sideLengthRadius = newSideLengthRadius;
        this.baseArea = Math.PI * Math.pow(this.sideLengthRadius,2.0);
        this.volume = 1.0/3.0 * Math.PI * Math.pow(this.sideLengthRadius,2.0) * this.height;
    }
}
