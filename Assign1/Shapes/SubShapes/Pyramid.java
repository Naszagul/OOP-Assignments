package Shapes.SubShapes;

import Shapes.Shape;

public class Pyramid extends Shape {

	public Pyramid(String newTitle, double newHeight, double newSideLengthRadius) {
		this.title = newTitle;
		this.height = newHeight;
		this.sideLengthRadius = newSideLengthRadius;
		this.baseArea = Math.pow(sideLengthRadius, 2.0);
		this.volume = 1.0 / 3.0 * Math.pow(sideLengthRadius, 2.0) * this.height;
	}

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}