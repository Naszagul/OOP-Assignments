package Shapes.SubPrisms;

import Shapes.Prism;

public class PentagonP extends Prism {
	public double side;
	public double height;
	public double tanVariable = Math.toRadians(54.0);
	public double baseArea = (5.0 * Math.pow(side,2.0) * Math.tan(tanVariable)) / 4.0;

}
