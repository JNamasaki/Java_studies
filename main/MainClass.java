package main;

import Sort.quickSort;
import Sort.mergeSort;


import java.util.Random;
public class MainClass {
    public static void main(String[] args) {
        int[] arr = generateArray(20);
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

    private static int[] generateArray(int leng){
        int[] arr = new int[leng];

        Random random = new Random();

        for (int i=0; i<leng; i++){
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}
