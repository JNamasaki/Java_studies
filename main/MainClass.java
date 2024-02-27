package main;

import Sort.quickSort;
import Sort.mergeSort;
public class MainClass {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5,13,28,6};
        int n = arr.length;


        System.out.println("Array original:");
        printArray(arr);

//         quickSort.quickSort(arr, 0, n - 1);


        System.out.println("merge:");
        printArray(mergeSort.mergeSort(arr,0,n-1));
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
