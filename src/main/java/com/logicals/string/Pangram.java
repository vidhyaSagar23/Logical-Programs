package com.logicals.string;

public class Pangram {
    /**
     * Given a string s, the task is to check if it is Pangram or not.
     * A pangram is a sentence containing all letters of the English Alphabet.
     **/

    public static void main(String[] args) {
        String  word = "The quick brown fox jumps over the lazy dog";
        if(new Pangram().isPangam(word)){
            System.out.println("Is Pangram");
        }
        else {
            System.out.println("Is Not Pangram");
        }
    }

    private boolean isPangam(String word) {
        word = word.replace(" ", "").toLowerCase();
        if(word.length() < 26){
            return false;
        }
        int count = 0;
        String characters = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < characters.length(); i++){
            count = 0;
            for(int j = 0; j < word.length(); j++){
                if(characters.charAt(i) == word.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(characters.charAt(i));
                return false;
            }
        }
        return true;
    }
}
