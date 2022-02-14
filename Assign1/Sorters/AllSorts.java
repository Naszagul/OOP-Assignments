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

    public static Shape[] quickSort(Shape inputArray[], int start, int end) {
        if (start < end) {
            int partitionIndex = partition(inputArray, start, end);
            quickSort(inputArray, start, partitionIndex - 1);
            quickSort(inputArray, partitionIndex + 1, end);
        }
        return inputArray;
    }

    public static int partition(Shape inputArray[], int start, int end) {
        Shape pivot = inputArray[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (inputArray[j].compareTo(pivot) == -1) {
                i++;
                Shape temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }

        Shape temp = inputArray[i + 1];
        inputArray[i + 1] = inputArray[end];
        inputArray[end] = temp;

        return i + 1;
    }

    public static Shape retrieveMax(Shape[] inputArray, int k) {
        Shape max = inputArray[0];
        for (int i = 1; i < k; i++)
            if (inputArray[i].compareTo(max) == 1)
                max = inputArray[i];
        return max;
    }

    public static void countArray(Shape[] inputArray, int k, int dig) {
        Shape[] out = new Shape[k];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < k; i++) {
            count[(int) ((inputArray[i].getHeight() / dig) % 10)]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (i = k - 1; i >= 0; i--) {
            out[count[(int) ((inputArray[i].getHeight() / dig) % 10)] - 1] = inputArray[i];
            count[(int) ((inputArray[i].getHeight() / dig) % 10)]--;
        }
        for (i = 0; i < k; i++)
            for (i = 0; i < k; i++)
                inputArray[i] = out[i];
    }

    public static Shape[] radixSort(Shape[] inputArray, int k) {
        Shape m = retrieveMax(inputArray, k);
        for (var dig = 1; (m.getHeight() / dig) > 0; dig *= 10)
            countArray(inputArray, k, dig);

        return inputArray;
    }

}