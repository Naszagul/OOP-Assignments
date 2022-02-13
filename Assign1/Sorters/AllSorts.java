package Sorters;

import Shapes.*;
import Sorters.*;
import Shapes.SubShapes.*;
import Shapes.SubPrisms.*;
import java.util.*;
import java.io.*;

public class AllSorts {

    public static Shape[] bubbleSort(Shape[] inputArray) {
        boolean sorted = false;
        Shape tempShape;

        while (!sorted) {

            sorted = true;

            for (int i = 0; i < inputArray.length - 1; i++) {

                if (inputArray[i].compareTo(inputArray[i + 1]) == 1) {
                    tempShape = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = tempShape;
                    sorted = false;
                }
            }
        }
        return inputArray;
    }

    public static Shape[] selectionSort(Shape[] inputArray) {
        {
            int n = inputArray.length;
            for (int i = 0; i < n - 1; i++) {

                int min_index = i;
                for (int j = i + 1; j < n; j++)
                    if (inputArray[i].compareTo(inputArray[i + 1]) == 1)
                        min_index = j;

                Shape temp = inputArray[min_index];
                inputArray[min_index] = inputArray[i];
                inputArray[i] = temp;
            }
            return inputArray;
        }
    }

    public static Shape[] insertionSort(Shape[] inputArray) {
        int n = inputArray.length;
        for (int i = 1; i < n; ++i) {
            Shape key = inputArray[i];
            int j = i - 1;

            while (j >= 0 && inputArray[j].compareTo(key) == 1) {
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j + 1] = key;
        }
        return inputArray;
    }

    // merge for merge sort
    public static void merge(Shape[] inputArray, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Shape[] L = new Shape[n1];
        Shape[] R = new Shape[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = inputArray[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = inputArray[mid + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) == -1 || L[i].compareTo(R[j]) == 0) {
                inputArray[k] = L[i];
                i++;
            } else {
                inputArray[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            inputArray[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            inputArray[k] = R[j];
            j++;
            k++;
        }
    }

    // sort for merge sort
    public static Shape[] mergeSort(Shape[] inputArray, int left, int right) {

        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(inputArray, left, mid);
            mergeSort(inputArray, mid + 1, right);

            // Merge the sorted halves
            merge(inputArray, left, mid, right);
        }
        return inputArray;

    }

    public static void quickSort(Shape[] inputArray) {

    }

    public static void radixSort(Shape[] inputArray) {

    }
}