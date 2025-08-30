package com.logicals.numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        new FibonacciSeries().printFibonacci(5);
    }

    private void printFibonacci(int n) {
        if(n==1){
            System.out.println(0);
            return;
        } else if (n == 2) {
            System.out.println(1);
            return;
        }
        int num1 = 0;
        int num2 = 1;
        int count = 2;
        System.out.print(num1 +", " + num2 +", ");
        while(n > count){
            System.out.print(num1 + num2 +", ");
            int temp = num1;
            num1 = num2;
            num2 = temp + num1;
            count++;
        }
    }
}
