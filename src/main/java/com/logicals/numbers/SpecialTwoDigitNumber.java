package com.logicals.numbers;

public class SpecialTwoDigitNumber {
    /**
     * A special two-digit number is such that when the sum of its digits is added to the product of its digits,
     * the result is equal to the original two-digit number.
     * Example: Consider the number 59.
     * Sum of digits = 5 + 9 = 14
     * Product of digits = 5 * 9 = 45
     * Sum of the sum of digits and product of digits = 14 + 45 = 59
     * Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits.
     * If the value is equal to the number input, then display the message "Special two—digit number" otherwise, display the message "Not a special two-digit number".
     * **/

    public static void main(String[] args) {
        int num = 59;
        if(new SpecialTwoDigitNumber().isSpecialTwoDigit(num)){
            System.out.println(num + " is Special two digit number");
        }
        else{
            System.out.println(num + " is not Special two digit number");
        }
    }

    private boolean isSpecialTwoDigit(int num) {
        return num == findSum(num) + findProd(num);
    }

    private int findProd(int num) {
        int sum = 0;
        while(num != 0){
            sum = sum + (num % 10);
            num /= 10;
        }
        System.out.println("Sum value is "+ sum);
        return sum;
    }

    private int findSum(int num) {
        int prod = 1;
        while(num != 0){
            prod = prod * (num % 10);
            num /= 10;
        }
        System.out.println("Sum value is "+ prod);
        return prod;
    }
}
