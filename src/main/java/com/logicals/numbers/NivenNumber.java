package com.logicals.numbers;

public class NivenNumber {
    /**
     * Write a program to input a number. Check and display whether it is a Niven number or not. (A number is said to be Niven which is divisible by the sum of its digits).
     * Example: Sample Input 126
     * Sum of its digits = 1 + 2 + 6 = 9 and 126 is divisible by 9
     * **/

    public static void main(String[] args) {
//        Some niven numbers are 126, 18, 153
        int number = 153;
        if(new NivenNumber().isNivenNumber(number)){
            System.out.println(number + " is niven number");
        }
        else{
            System.out.println(number +" is not niven number");
        }
    }

    private boolean isNivenNumber(int n) {
        int total = 0;
        int dub = n;
        while(dub != 0){
            total = total + (dub % 10);
            dub /= 10;
        }
        System.out.println(total);
        return n%total == 0;
    }
}
