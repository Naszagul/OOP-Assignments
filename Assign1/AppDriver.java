
import Shapes.*;
import Shapes.SubShapes.*;
import Shapes.SubPrisms.*;
import java.util.*;
import java.io.*;

public class AppDriver {

    public static void main(String[] args) throws FileNotFoundException{
        //declaring file to read from
        File shapeFile = new File ("D:/Sem3/adv_oop/Assignment1/polyfor1.txt");
        Scanner scanShapes = new Scanner (shapeFile);
        int arraySize = Integer.valueOf(scanShapes.next());

        //variables to add shapes to array
        Shape [] shapeArray = new Shape [arraySize];
        int i = 0;
        String title;
        double height;
        double sideLengthRadius;
        boolean continueInput = true;

        //add stuff
        while (i < arraySize){

            title = scanShapes.next();
            height = Double.valueOf(scanShapes.next());
            sideLengthRadius = Double.valueOf(scanShapes.next());
            Shape newShape = new Cylinder (title, height, sideLengthRadius);
            shapeArray [i] = newShape;
            
            //as per assignment every 1000th item is printed
            if (i % 1000 == 0){
                Shape printShape = shapeArray [i];
                System.out.println(printShape.getTitle());
                System.out.println(printShape.getHeight());
                System.out.println(printShape.getBaseArea());
                System.out.println(printShape.getVolume());
            }
            i++;
        }

    }
}
