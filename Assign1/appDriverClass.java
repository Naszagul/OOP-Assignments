
import Shapes.*;
import Shapes.SubShapes.*;
import Shapes.SubPrisms.*;

public class appDriverClass {
    public static void main(String[] args) {

        //a cylinder, cone, prism, pyramid,
        //PentagonP, OctagonP, TriangleP, SquareP

        Shape testSquareP = new SquareP(1.0,1.0);
        Shape testTriangleP = new TriangleP(2.0,2.0);
        Shape testPentagonP = new PentagonP(4.0,4.0);

        System.out.println("testSquareP = " + testSquareP.getHeight());
        System.out.println("testTriangleP = " +testTriangleP.getHeight());
        System.out.println("testPentagonP = " + testPentagonP.getHeight());
    }
}
