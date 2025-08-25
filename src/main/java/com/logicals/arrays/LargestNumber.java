package com.logicals.arrays;

public class LargestNumber {
    /* To find the largest number in an array */
    public static void main(String[] args) {
        int[] ar = {23, 456, 454, 4300,453, 235, -1};
        int max = new LargestNumber().findLargest(ar);
        int min = new LargestNumber().findSmallest(ar);
        System.out.println("Maximum number is : "+ max + "\nMinimum number is : " + min+ "\nDifference between min and max is : " + (max - min));
    }

    private int findSmallest(int[] ar) {
        int min = ar[0];
        for(int i = 0; i <= ar.length -1; i++){
            if(ar[i] < min){
                min = ar[i];
            }
        }
        return min;
    }

    private int findLargest(int[] ar) {
        int max = ar[0];
        for(int i = 0; i <= ar.length -1; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }
}
