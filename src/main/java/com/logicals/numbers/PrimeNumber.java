package com.logicals.numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 141;

        if(isPrime(num)){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }
    }

    private static boolean isPrime(int num) {
        if(num == 0 || num == 1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
