package com.logicals.numbers;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(printFactorial(5));;
    }

    private static int printFactorial(int n) {
        int total = 1;
        for(int i = n; i >0; i--){
            total = total * i;
        }
        return total;
    }
}
