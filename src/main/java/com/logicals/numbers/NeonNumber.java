package com.logicals.numbers;

public class NeonNumber {
    /**
     * Square of Sum of digits should be equal to org number
     * input 81 => 8 + 1 = 9 => 9 * 9 = 81
     * **/

    public static void main(String[] args) {
        int num = 81;
        if(new NeonNumber().isNeon(num)){
            System.out.println(num + " is neon number");
        }
        else{
            System.out.println(num + " is not neon number");
        }
    }

    private boolean isNeon(int num) {
        int sum = getSum(num);
        return num == sum * sum;
    }

    private int getSum(int num) {
        int total = 0;
        while(num != 0){
            total = total + (num % 10);
            num /= 10;
        }
        return total;
    }
}
