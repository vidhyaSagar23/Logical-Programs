package com.logicals.arrays.numbers;

public class Palindromes {
    /* Find and return true if the number is palindrome else return false*/
    public static void main(String[] args) {
        int[] ar = {121, 222,321,4334,433,564};
        for (int i : ar) {
            boolean res = new Palindromes().findPalindrome(i);
            if(res){
                System.out.println(i + " is Palindrome");
            }
            else{
                System.out.println(i + " is not Palindrome");
            }
        }
    }

    private boolean findPalindrome(int org) {
        int temp = org;
        int res = 0;
        while(org != 0){
          int rem = org % 10;
          res = res * 10 + rem;
          org /= 10;
        }
        return temp == res;
    }
}
