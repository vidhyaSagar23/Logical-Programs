package com.logicals.numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(123));;
    }

    private static int reverseNum(int n) {
        int res = 0;
        while(n != 0){
            int temp = n % 10;
            res = res * 10 + temp;
            n /= 10;
        }
        return res;
    }
}
