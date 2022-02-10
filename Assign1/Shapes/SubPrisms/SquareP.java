package Shapes.SubPrisms;
import Shapes.Prism;

public class SquareP extends Prism {

	public SquareP (String newTitle, double newHeight, double newSideLengthRadius){
		this.title = newTitle;
		this.height = newHeight;
		this.sideLengthRadius = newSideLengthRadius;
		this.baseArea = Math.pow(this.sideLengthRadius,2.0);
		this.volume = Math.pow(this.sideLengthRadius,2.0) * this.height; 
	}
}
