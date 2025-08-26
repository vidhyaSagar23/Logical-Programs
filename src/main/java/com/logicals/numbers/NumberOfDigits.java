package com.logicals.numbers;

public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(54321678));;
    }

    private static int countDigits(int n) {
        int count = 0;
        while(n !=0){
            count++;
            n /= 10;
        }
        return count;
    }
}
