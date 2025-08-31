package com.logicals.string;

public class Palindrome {
    public static void main(String[] args) {
        String word = "malayalam";

        if(new Palindrome().isPalindrome(word)){
            System.out.println(word + " is Palindrome");
        }
        else{
            System.out.println(word +" is not Palindrome");
        }
    }

    private boolean isPalindrome(String word) {
        int length = word.length() - 1;
        for(int i = 0; i <= length/2; i++){
            if(word.charAt(i) != word.charAt(length)){
                return false;
            }
            length--;
        }
        return true;
    }
}
