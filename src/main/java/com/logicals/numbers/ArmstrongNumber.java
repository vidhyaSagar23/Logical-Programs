package com.logicals.numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
        if(new ArmstrongNumber().isArmsStrong(1634)){
            System.out.println("Given number is Armstrong");
        }
        else {
            System.out.println("Given number is not Armstrong");
        }
    }

    private boolean isArmsStrong(int n) {
        int count = getCount(n, 0);
        int total = 0;
        int dup = n;
        while(dup != 0){
            int subTotal = 1;
            int temp = dup % 10;
            System.out.println("Finding value for "+ temp);
            for(int i=0; i< count; i++){
                subTotal *= temp;
            }
            dup /= 10;
            total += subTotal;
            System.out.println("Subtotal is "+ subTotal);
            System.out.println("Total is "+total);
            System.out.println("==========================");
        }
        return total == n;
    }

    private int getCount(int n, int count) {
        while(n !=0){
            count++;
            n /= 10;
        }
        return count;
    }
}
