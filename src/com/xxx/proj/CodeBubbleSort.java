package com.xxx.proj;

import java.util.Arrays;

public class CodeBubbleSort {
    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int end = arr.length - 1 ; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]){
                    swap(arr,i,i + 1);
                }
            }
        }

    }

    public static void swap(int[] arr ,int i ,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,6,2,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
