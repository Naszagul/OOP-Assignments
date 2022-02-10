package Shapes.SubPrisms;
import Shapes.Prism;

public class PentagonP extends Prism {

	public double tanVariable = Math.toRadians(54.0);
	
	public PentagonP (String newTitle, double newHeight, double newSideLengthRadius){
		this.title = newTitle;
		this.height = newHeight;
		this.sideLengthRadius = newSideLengthRadius;
		this.baseArea = (5.0 * Math.pow(this.sideLengthRadius,2.0) * Math.tan(tanVariable)) / 4.0;
		this.volume = this.baseArea * this.height;
	}
}
