
import Shapes.*;
import Sorters.*;
import Shapes.SubShapes.*;
import Shapes.SubPrisms.*;
import java.util.*;
import java.io.*;

public class AppDriver {

    public static void main (String[] args) throws FileNotFoundException{
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
        //boolean continueInput = true;

        //add stuff
        while (i < arraySize){

            title = scanShapes.next();
            height = Double.valueOf(scanShapes.next());
            sideLengthRadius = Double.valueOf(scanShapes.next());

            //creating the shape based on the title
            if (title.equals("Cylinder")){
                Shape newShape = new Cylinder (title, height, sideLengthRadius);
                shapeArray [i] = newShape;
            }

            else if (title.equals("Pyramid")){
                Shape newShape = new Pyramid (title, height, sideLengthRadius);
                shapeArray [i] = newShape;
            }

            else if (title.equals("Cone")){
                Shape newShape = new Cone (title, height, sideLengthRadius);
                shapeArray [i] = newShape;
            }

            else if (title.equals("OctagonalPrism")){
                Shape newShape = new OctagonP (title, height, sideLengthRadius);
                shapeArray [i] = newShape;
            }

            else if (title.equals("PentagonalPrism")){
                Shape newShape = new PentagonP (title, height, sideLengthRadius);
                shapeArray [i] = newShape;
            }

            else if (title.equals("SquarePrism")){
                Shape newShape = new SquareP (title, height, sideLengthRadius);
                shapeArray [i] = newShape;
            }

            //if it's not anything else, it's a Triangle
            else{
                Shape newShape = new TriangleP (title, height, sideLengthRadius);
                shapeArray [i] = newShape;
            }

            //as per assignment every first, last and 1000th item is printed
            if ( i==0 || i==arraySize -1 ||i % 1000 == 0 ){
                System.out.println(shapeArray[i].getHeight());
                // Shape printShape = shapeArray [i];
                // System.out.println(printShape.getTitle());
                // System.out.println(printShape.getHeight());
                // System.out.println(printShape.getBaseArea());
                // System.out.println(printShape.getVolume());
                if (i==arraySize -1){
                    System.out.println("------");
                }
            }
            i++;
        }
        //sort the array
        Shape [] sortedShapeArray = AllSorts.bubbleSort(shapeArray);
        //print the first, last, and every 1000th item to reference
        for (int k=0 ; k < arraySize -1 ; k++){

            if ( k==0 || k==arraySize -1 ||k % 1000 == 0 ){
                System.out.println(sortedShapeArray[k].getHeight());
            }
        }
    }
}
