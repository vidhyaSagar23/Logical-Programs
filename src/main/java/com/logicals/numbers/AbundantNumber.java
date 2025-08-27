package com.logicals.numbers;

public class AbundantNumber {
    /**
     * An Abundant number is a number for which the sum of its proper factors is greater than the number itself.
     * Write a program to input a number and check and print whether it is an Abundant number or not.
     *
     * Example:
     *
     * Consider the number 12.
     *
     * Factors of 12 = 1, 2, 3, 4, 6 Sum of factors = 1 + 2 + 3 + 4 + 6 = 16
     *
     * As 16 > 12 so 12 is an Abundant number.
     * **/

    public static void main(String[] args) {
//        Few abundant inputs : 12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96
//        Few Non Abundant inputs : 4, 5, 6, 20161, 20147
        int n = 12;
        if(new AbundantNumber().isAbundant(n))
            System.out.println("Given Number "+ n + " is Abundant Number");
        else
            System.out.println("Given Number "+ n + " is not an Abundant Number");
    }

    private boolean isAbundant(int n) {
        int total = 0;
        for(int i = 2; i<= n/2; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                total += i;
            }
        }
        System.out.println();
        System.out.println(total);
        return total > n;
    }
}

/**
 * First few abundant numbers
 *
 * 12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96
 *
 * A few big non-abundant numbers just before that include:
 *
 * 20161
 *
 * 20147
 *
 * 20135
 *
 * 20123
 *
 * **/
