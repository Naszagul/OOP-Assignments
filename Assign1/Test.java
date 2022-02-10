
import Shapes.*;
import Shapes.SubShapes.*;
import Shapes.SubPrisms.*;

public class Test {
    public static void main(String[] args) {

        Shape cly_one = new Cylinder("Cylinder", 12,12);
        System.out.println(cly_one.getHeight());
        System.out.println(cly_one.getVolume());
        System.out.println(cly_one.getTitle());
        System.out.println(cly_one.getBaseArea());
        // Shape square_one = new SquareP("Square",1.0,1.0);
        // Shape square_two = new SquareP("Square",1.0,1.0);

        // int square_expected = 0;
        // int square_result = square_one.compareTo(square_two);

        // Shape triangle_one = new TriangleP("Triangle",2.0,2.0);
        // Shape triangle_two = new TriangleP("Triangle",3.0,3.0);

        // int triangle_expected = -1;
        // int triangle_result = triangle_one.compareTo(triangle_two);

        // Shape pentagon_one = new PentagonP("Pentagon",44.0,44.0);
        // Shape pentagon_two = new PentagonP("Pentagon",6.0,6.0);

        // int pentagon_expected = 1;
        // int pentagon_result = pentagon_one.compareTo(pentagon_two);

        // System.out.println("Square result " + (square_result == square_expected));
        // System.out.println("Triangle result " + (triangle_result == triangle_expected));
        // System.out.println("Pentagon result " + (pentagon_result == pentagon_expected));
        // System.out.println(square_two.getTitle());
        // System.out.println(triangle_two.getTitle());
        // System.out.println(pentagon_two.getTitle());
    }
}
