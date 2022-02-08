package Shapes.SubShapes;

import Shapes.Prism;

public class TriangleP extends Prism {
	public double side;
	public double height;
	public double baseArea = (Math.pow(side,2.0) * Math.sqrt(3.0)) / 4.0;
	public double volume = baseArea * height;
}
