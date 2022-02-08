package Shapes.SubPrisms;

import Shapes.Prism;

public class SquareP extends Prism {
	public double side;
	public double height;
	public double baseArea = Math.pow(side,2.0);
	public double volume = Math.pow(side,2.0) * height; 
}
