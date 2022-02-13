package Shapes.SubPrisms;

import Shapes.Prism;
import Shapes.Shape;

public class OctagonP extends Prism {

	public OctagonP(String newTitle, double newHeight, double newSideLengthRadius) {
		this.title = newTitle;
		this.height = newHeight;
		this.sideLengthRadius = newSideLengthRadius;
		this.baseArea = 2.0 * (1.0 + Math.sqrt(2.0)) * Math.pow(this.sideLengthRadius, 2.0);
		this.volume = this.baseArea * this.height;
	}

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}