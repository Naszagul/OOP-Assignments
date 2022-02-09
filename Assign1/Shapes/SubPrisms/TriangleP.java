package Shapes.SubPrisms;
import Shapes.Prism;

public class TriangleP extends Prism {

	public TriangleP (double newHeight, double newSideLengthRadius){
	this.height = newHeight;
	this.sideLengthRadius = newSideLengthRadius;
	this.baseArea = (Math.pow(this.sideLengthRadius,2.0) * Math.sqrt(3.0)) / 4.0;
	this.volume = this.baseArea * this.height;
	}
}
