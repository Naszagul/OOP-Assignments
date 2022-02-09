
import Shapes.*;
import Shapes.SubShapes.*;
import Shapes.SubPrisms.*;

public class appDriverClass {
    public static void main(String[] args) {

        Shape square_one = new SquareP(1.0,1.0);
        Shape square_two = new SquareP(1.0,1.0);

        int square_expected = 1;
        int square_result = square_one.compareTo(square_two);

        Shape triangle_one = new TriangleP(2.0,2.0);
        Shape triangle_two = new TriangleP(3.0,3.0);

        int triangle_expected = 1;
        int triangle_result = triangle_one.compareTo(triangle_two);

        Shape pentagon_one = new PentagonP(44.0,44.0);
        Shape pentagon_two = new PentagonP(6.0,6.0);

        int pentagon_expected = 0;
        int pentagon_result = pentagon_one.compareTo(pentagon_two);

        System.out.println(square_result == square_expected);
        System.out.println(triangle_result == triangle_expected);
        System.out.println(pentagon_result == pentagon_expected);
    }
}
