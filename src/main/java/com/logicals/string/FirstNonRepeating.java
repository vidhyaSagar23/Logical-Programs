package com.logicals.string;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String word = "Geeks for Geeks";
        char ch = new FirstNonRepeating().findNonRepeating(word);
        System.out.println(ch);
    }

    private char findNonRepeating(String word) {
        char[] ch = word.toCharArray();

        for(int i = 0; i < ch.length; i++){
            int count = 0;
            for(int j = 0; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                }
            }
            if(count == 1){
                return ch[i];
            }
        }
        return ' ';
    }
}
