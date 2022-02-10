package Sorters;
import Shapes.*;
import Sorters.*;
import Shapes.SubShapes.*;
import Shapes.SubPrisms.*;
import java.util.*;
import java.io.*;
public class AllSorts {


    public static Shape [] bubbleSort(Shape [] inputArray){
        boolean sorted = false;
        Shape tempShape;
        Shape [] alteredArray = inputArray;

        while(!sorted) {

            sorted = true;

            for (int i = 0; i < alteredArray.length - 1; i++) {

                if (alteredArray[i].getHeight() >  alteredArray[i+1].getHeight()){
                    tempShape = alteredArray[i];
                    alteredArray[i] = alteredArray[i+1];
                    alteredArray[i+1] = tempShape;
                    sorted = false;
                }
            }
        }
        return alteredArray;
    }

    public static void selectionSort(Shape [] inputArray){

    }

    public static void insertionSort(Shape [] inputArray){

    }

    public static void mergeSort(Shape [] inputArray){

    }

    public static void quickSort(Shape [] inputArray){

    }

    public static void radixSort(Shape [] inputArray){

    }
}