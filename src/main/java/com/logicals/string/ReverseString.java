package com.logicals.string;

public class ReverseString {
    public static void main(String[] args) {
        String word = "I AM THE BEST";
        String result = new ReverseString().reverseUsingCharArray(word);
        System.out.println(result);
    }

    private String reverseUsingCharArray(String word) {
        int length = word.length() - 1;
        char[] ch = word.toCharArray();
        for(int i = 0; i < ch.length/2;i++){
            char temp = ch[i];
            ch[i] = ch[length];
            ch[length--] = temp;
        }
        String res = "";
        for(char c:ch){
            res =  res + c;
//            System.out.print(c);
        }
        return res;
    }
}
