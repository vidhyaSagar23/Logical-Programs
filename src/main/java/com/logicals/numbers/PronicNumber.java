package com.logicals.numbers;

public class PronicNumber {
//    Pronic is a Product of two consecutive Integers 3*4 = 12;

    public static void main(String[] args) {
        System.out.println(new PronicNumber().isPronic(1001001));
    }

    private boolean isPronic(int n) {
        int product = 1;
        for(int i = 0; i <= n/2; i++){
            product = i * (i + 1);
            if(product == n){
                System.out.println(product);
                return true;
            }
        }
        return false;
    }
}
