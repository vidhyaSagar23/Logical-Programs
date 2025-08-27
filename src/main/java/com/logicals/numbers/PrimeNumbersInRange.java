package com.logicals.numbers;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Total Number Prime numbers between range is "+ new PrimeNumbersInRange().printPrimeNumbersBetween(0, 2000, 0));;
    }

    private int printPrimeNumbersBetween(int start, int end, int total) {
        for(int i = start; i <= end; i++){
            if( i == 0 || i == 1){
                continue;
            }
            int count = 0;
            for(int j = 2; j <= i/2; j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                total++;
                System.out.println(i + " is an Prime Number");
            }
        }
        System.out.println("=================================");
        return total;
    }
}
