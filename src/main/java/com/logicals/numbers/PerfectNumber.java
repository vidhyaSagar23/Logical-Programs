package com.logicals.numbers;

public class PerfectNumber {

    /**
     * 6 is a perfect number because its proper divisors (1, 2, and 3) sum to 6 (1 + 2 + 3 = 6).
     * Another example is 28, where its proper divisors (1, 2, 4, 7, 14) sum to 28 (1 + 2 + 4 + 7 + 14 = 28).
     * **/

    public static void main(String[] args) {
        int n = 28;
        if(new PerfectNumber().isPerfect(n)){
            System.out.println("\n"+n +" is Perfect Number");
        }
        else{
            System.out.println(n +" is not Perfect Number");
        }
    }

    private boolean isPerfect(int n) {
        int sum = 0;
        for(int i =1; i <= n/2; i++){
            if(n%i==0){
                System.out.print(i+ " ");
                sum += i;
            }
        }
        return sum == n;
    }
}
