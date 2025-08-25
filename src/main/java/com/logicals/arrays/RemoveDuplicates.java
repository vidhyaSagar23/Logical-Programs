package com.logicals.arrays;

public class RemoveDuplicates {
    /* Remove duplicate number present in the array and store it in differnt array */
    public static void main(String[] args) {
        int[] ar = {23, 18, 0, 0, 23, 2, 4, 4};
        int[] a = new RemoveDuplicates().removeDuplicate(ar);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private int[] removeDuplicate(int[] ar) {
        int a[] = new int[0];
        int count =0;
        for(int i=0; i<=ar.length-1; i++){
            for (int j = i +1; j <= ar.length-1; j++) {
                if(ar[i]==ar[j]){
                    count++;
                    break;
                }
            }
            if (count == 0){
                int[] temp = a;
                a = new int[a.length+1];
                for(int k=0; k<temp.length; k++){
                    a[k] = temp[k];
                }
                a[a.length-1] = ar[i];
            }
            count =0;
        }
        return a;
    }
}
