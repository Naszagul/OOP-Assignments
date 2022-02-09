package Shapes.SubShapes;

import Shapes.Shape;

public class Pyramid extends Shape {

	public Pyramid (double newHeight, double newSideLengthRadius){
		this.height = newHeight;
		this.sideLengthRadius = newSideLengthRadius;
		this.baseArea = Math.pow(sideLengthRadius,2.0);
		this.volume = 1.0 / 3.0 * Math.pow(sideLengthRadius,2.0) * this.height;
	}
}
