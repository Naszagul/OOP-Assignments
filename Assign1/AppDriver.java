
import Shapes.*;
import Shapes.SubShapes.*;
import Sorters.*;
import Shapes.SubPrisms.*;
import java.util.*;
import java.io.*;

public class AppDriver {

    public static void main(String[] args) throws FileNotFoundException {
        // declaring file to read from
        Scanner input = new Scanner(System.in);
        // TextFiles/polyfor1.txt
        System.out.print("\nEnter a file path: ");
        String file = input.nextLine();
        File shapeFile = new File(file);
        Scanner scanShapes = new Scanner(shapeFile);
        int arraySize = Integer.valueOf(scanShapes.next());

        System.out
                .print("Enter sort type:\n(B)ubble\n(S)election\n(I)nsertion\n(M)erge\n(Q)uick\n(R)adix\n\nChoice: ");
        String sortChoice = input.nextLine().toLowerCase();

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

        if (sortChoice.equals("b")) {
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
            System.out.println("Bubble Sort Runtime: " + bubbleTotalTime / 1000 + "seconds");
        } else if (sortChoice.equals("s")) {
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
            System.out.println("Selection Sort Runtime: " + selectionTotalTime / 1000 + "seconds");
        } else if (sortChoice.equals("i")) {
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
            System.out.println("Insertion Sort Runtime: " + insertionTotalTime / 1000 + "seconds");
        } else if (sortChoice.equals("m")) {
            // Merge Sort
            System.out.println("\nMerge Sort:");

            double mergeStartTime = System.currentTimeMillis();
            Shape[] mergeSortedShapeArray = AllSorts.mergeSort(shapeArray, 0,
                    shapeArray.length - 1);
            double mergeEndTime = System.currentTimeMillis();
            double mergeTotalTime = mergeEndTime - mergeStartTime;

            for (int k = 0; k < arraySize - 1; k++) {
                if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
                    System.out.println(mergeSortedShapeArray[k].getHeight());
                }
            }
            // Print Merge Sort Runtime
            System.out.println("Merge Sort Runtime: " + mergeTotalTime / 1000 + "seconds");
        }

        else if (sortChoice.equals("q")) {
            // Quick Sort
            System.out.println("\nQuick Sort:");

            double quickStartTime = System.currentTimeMillis();
            Shape[] quickSortedShapeArray = AllSorts.quickSort(shapeArray, 0, shapeArray.length - 1);
            double quickEndTime = System.currentTimeMillis();
            double quickTotalTime = quickEndTime - quickStartTime;

            for (int k = 0; k < arraySize - 1; k++) {
                if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
                    System.out.println(quickSortedShapeArray[k].getHeight());
                }
            }
            // Print Quick Sort Runtime
            System.out.println("Quick Sort Runtime: " + quickTotalTime / 1000 + " seconds");
        }

        else if (sortChoice.equals("r")) {
            // Radix Sort
            System.out.println("\nRadix Sort:");

            double radixStartTime = System.currentTimeMillis();
            Shape[] radixSortedShapeArray = AllSorts.radixSort(shapeArray, arraySize);
            double radixEndTime = System.currentTimeMillis();
            double radixTotalTime = radixEndTime - radixStartTime;

            for (int k = 0; k < arraySize - 1; k++) {
                if (k == 0 || k == arraySize - 1 || k % 1000 == 0) {
                    System.out.println(radixSortedShapeArray[k].getHeight());
                }
            }
            // Print Radix Sort Runtime
            System.out.println("Radix Sort Runtime: " + radixTotalTime / 1000 + "seconds");
        } else {
            System.out.println("Invalid Input. Please try again.");
        }
        scanShapes.close();
        input.close();
    }
}