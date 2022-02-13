package Shapes.SubPrisms;

import Shapes.Prism;
import Shapes.Shape;

public class SquareP extends Prism {

	public SquareP(String newTitle, double newHeight, double newSideLengthRadius) {
		this.title = newTitle;
		this.height = newHeight;
		this.sideLengthRadius = newSideLengthRadius;
		this.baseArea = Math.pow(this.sideLengthRadius, 2.0);
		this.volume = Math.pow(this.sideLengthRadius, 2.0) * this.height;
	}

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
