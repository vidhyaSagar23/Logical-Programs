package com.logicals.arrays.numbers;

public class ReverseArray {
    /* Reverse an array without creating another array*/
    public static void main(String []a){
        int[] ar = {1, 2, 3, 4, 5};
        for(Integer i : new ReverseArray().reverse(ar)){
            System.out.print(i + " ");
        }
    }

    public int[] reverse(int[] ar){
        int in = 0;
        for(int i = ar.length-1; i >= (ar.length -1) /2; i--) {
            int temp = ar[in];
            ar[in++] = ar[i];
            ar[i] = temp;
        }
        return ar;
    }
}
