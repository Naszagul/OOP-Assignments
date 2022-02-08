package Shapes.SubShapes;

import Shapes.Shape;

public class Pyramid extends Shape {
	public double side;
	public double height;
	public double volume = 1.0 / 3.0 * Math.pow(side,2) * height;
}
