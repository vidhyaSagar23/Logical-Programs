package com.logicals.arrays.numbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,7,9,12,15,18,23,31};
        for(int a: ar){
            boolean flag = new PrimeNumbers().isPrime(a);
            if (flag){
                System.out.println(a + " is Prime Number");
            }
            else{
                System.out.println(a + " is not prime number");
            }
        }
    }

    private boolean isPrime(int a) {
        if(a==0 || a== 1){
            return false;
        }
        int count = 0;
        for(int i=2; i<=a/2;i++){
            if(a%i==0){
                count++;
                break;
            }
        }
        return count == 0;
    }
}
