package com.logicals.numbers;

public class StrongNumber {
    /**
     * The number 145 is a strong number because:
     * 1! (factorial of 1) = 1
     * 4! (factorial of 4) = 4 * 3 * 2 * 1 = 24
     * 5! (factorial of 5) = 5 * 4 * 3 * 2 * 1 = 120
     * Sum of factorials = 1 + 24 + 120 = 145.
     * Since the sum of the factorials of its digits (145) is equal to the original number (145), 145 is a strong number.
     * **/

    public static void main(String[] args) {
        int n = 145;
        if(new StrongNumber().isStrong(n)){
            System.out.println("\n"+n +" is Strong Number");
        }
        else {
            System.out.println("\n"+n + " is not Strong number");
        }
    }

    private boolean isStrong(int n) {
        int sum = 0;
        int dup = n;
        while(dup != 0){
            int prod = 1;
            int temp = dup % 10;
            for(int i = 1; i <= temp; i++){
                prod *= i;
            }
            System.out.print(prod+ " ");
            sum += prod;
            dup /= 10;
        }
        return sum == n;
    }
}
