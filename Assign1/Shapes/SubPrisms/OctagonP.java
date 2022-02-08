package Shapes.SubPrisms;

public class OctagonP {
	public double side;
	public double height;
	public double baseArea = 2.0 (1.0 + Math.sqrt(2.0)) * Math.pow(side,2);
	public double volume = baseArea * height;
}
