package com.logicals.numbers;

public class SpyNumber {
    /**
     *Write a program to accept a number and check whether it is a 'Spy Number' or not. (A number is spy if the sum of its digits equals the product of its digits.)
     * Example: Sample Input: 1124
     * Sum of the digits = 1 + 1 + 2 + 4 = 8
     * Product of the digits = 1*1*2*4 = 8
     **/

    public static void main(String[] args) {
        int n = 1124;
        if(new SpyNumber().isSpy(n)){
            System.out.println(n + " is Spy Number");
        }
        else{
            System.out.println(n + "is not Spy Number");
        }
    }

    private boolean isSpy(int n) {
        return findSum(n) == findProduct(n);
    }

    private int findProduct(int n) {
        int total = 0;
        while(n != 0){
            total = total + (n % 10);
            n /= 10;
        }
        System.out.println("Sum value is "+total);
        return total;
    }

    private int findSum(int n) {
        int prod = 1;
        while(n != 0){
            prod =prod * n % 10;
            n /= 10;
        }
        System.out.println("Product value is "+ prod);
        return prod;
    }
}
