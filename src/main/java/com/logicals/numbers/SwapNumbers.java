package com.logicals.numbers;

public class SwapNumbers {
    public static void main(String[] args) {
        swapIt(10,5);
    }

    private static void swapIt(int n, int m) {
        n = n + m;
        m = n - m;
        n = n - m;

        System.out.println(n +" "+ m);
    }
}
