
import Shapes.*;
import Sorters.*;
import Shapes.SubShapes.*;
import Shapes.SubPrisms.*;
import java.util.*;
import java.io.*;

public class AppDriver {

    public static void main(String[] args) throws FileNotFoundException {
        // declaring file to read from
        File shapeFile = new File("TextFiles/polyfor1.txt");
        Scanner scanShapes = new Scanner(shapeFile);
        int arraySize = Integer.valueOf(scanShapes.next());

        // variables to add shapes to array
        Shape[] shapeArray = new Shape[arraySize];
        String title;
        double height;
        double sideLengthRadius;

        // add stuff
        for (int i = 0; i < arraySize; i++) {

            title = scanShapes.next();
            height = Double.valueOf(scanShapes.next());
            sideLengthRadius = Double.valueOf(scanShapes.next());

            // creating the shape based on the title
            if (title.equals("Cylinder")) {
                Shape newShape = new Cylinder(title, height, sideLengthRadius);
                shapeArray[i] = newShape;
            }

            else if (title.equals("Pyramid")) {
                Shape newShape = new Pyramid(title, height, sideLengthRadius);
                shapeArray[i] = newShape;
            }

            else if (title.equals("Cone")) {
                Shape newShape = new Cone(title, height, sideLengthRadius);
                shapeArray[i] = newShape;
            }

            else if (title.equals("OctagonalPrism")) {
                Shape newShape = new OctagonP(title, height, sideLengthRadius);
                shapeArray[i] = newShape;
            }

            else if (title.equals("PentagonalPrism")) {
                Shape newShape = new PentagonP(title, height, sideLengthRadius);
                shapeArray[i] = newShape;
            }

            else if (title.equals("SquarePrism")) {
                Shape newShape = new SquareP(title, height, sideLengthRadius);
                shapeArray[i] = newShape;
            }

            // if it's not anything else, it's a Triangle
            else {
                Shape newShape = new TriangleP(title, height, sideLengthRadius);
                shapeArray[i] = newShape;
            }
        }

        // Bubble Sort
        System.out.println("\nBubble Sort:");
        double bubbleStartTime = System.currentTimeMillis();
        Shape[] bubbleSortedShapeArray = AllSorts.bubbleSort(shapeArray);
        double bubbleEndTime = System.currentTimeMillis();
        double bubbleTotalTime = bubbleEndTime - bubbleStartTime;

        // print the first, last, and every 1000th item to reference
        for (int k = 0; k < arraySize - 1; k++) {
            if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
                System.out.println(bubbleSortedShapeArray[k].getHeight());
            }
        }
        // Print Bubble Sort runtime
        System.out.println("Bubble Sort Runtime: " + bubbleTotalTime);

        // Selection Sort
        System.out.println("\nSelection Sort:");

        double selectionStartTime = System.currentTimeMillis();
        Shape[] selectionSortedShapeArray = AllSorts.selectionSort(shapeArray);
        double selectionEndTime = System.currentTimeMillis();
        double selectionTotalTime = selectionEndTime - selectionStartTime;

        for (int k = 0; k < arraySize - 1; k++) {
            if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
                System.out.println(selectionSortedShapeArray[k].getHeight());
            }
        }
        // Print Selection Sort Runtime
        System.out.println("Selection Sort Runtime: " + selectionTotalTime);

        // Insertion Sort
        System.out.println("\nInsertion Sort:");

        double insertionStartTime = System.currentTimeMillis();
        Shape[] insertionSortedShapeArray = AllSorts.insertionSort(shapeArray);
        double insertionEndTime = System.currentTimeMillis();
        double insertionTotalTime = insertionEndTime - insertionStartTime;

        for (int k = 0; k < arraySize - 1; k++) {
            if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
                System.out.println(insertionSortedShapeArray[k].getHeight());
            }
        }
        // Print Insertion Sort Runtime
        System.out.println("Insertion Sort Runtime: " + insertionTotalTime);

        // Merge Sort
        System.out.println("\nMerge Sort:");

        double mergeStartTime = System.currentTimeMillis();
        Shape[] mergeSortedShapeArray = AllSorts.mergeSort(shapeArray, 0, shapeArray.length - 1);
        double mergeEndTime = System.currentTimeMillis();
        double mergeTotalTime = mergeEndTime - mergeStartTime;

        for (int k = 0; k < arraySize - 1; k++) {
            if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
                System.out.println(mergeSortedShapeArray[k].getHeight());
            }
        }
        // Print Merge Sort Runtime
        System.out.println("Merge Sort Runtime: " + mergeTotalTime);

        // // Quick Sort
        // System.out.println("\nQuick Sort:");

        // double quickStartTime = System.currentTimeMillis();
        // Shape[] quickSortedShapeArray = AllSorts.quickSort(shapeArray);
        // double quickEndTime = System.currentTimeMillis();
        // double quickTotalTime = quickEndTime - quickStartTime;

        // for (int k = 0; k < arraySize - 1; k++) {
        // if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
        // System.out.println(quickSortedShapeArray[k].getHeight());
        // }
        // }
        // // Print Quick Sort Runtime
        // System.out.println("Quick Sort Runtime: " + quickTotalTime);

        // // Radix Sort
        // System.out.println("\nRadix Sort:");

        // double radixStartTime = System.currentTimeMillis();
        // Shape[] radixSortedShapeArray = AllSorts.radixSort(shapeArray);
        // double radixEndTime = System.currentTimeMillis();
        // double radixTotalTime = radixEndTime - radixStartTime;

        // for (int k = 0; k < arraySize - 1; k++) {
        // if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
        // System.out.println(radixSortedShapeArray[k].getHeight());
        // }
        // }
        // // Print Radix Sort Runtime
        // System.out.println("Radix Sort Runtime: " + radixTotalTime);
        scanShapes.close();
    }
}