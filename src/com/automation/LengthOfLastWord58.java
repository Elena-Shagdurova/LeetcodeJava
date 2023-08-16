package com.automation;
//Given a string s consisting of words and spaces,
// return the length of the last word in the string.
//A word is a maximal substring
// consisting of non-space characters only.
public class LengthOfLastWord58 {
    public static void main(String[] args) {
        String s = "Hello World";
        int num = lengthOfLastWord(s);
        System.out.println("Quantity of characters "+ num);
    }
    public static int lengthOfLastWord(String s){
        //we create variable, which will store the length of the last word
        int lengthOfLastWord = 0;

        //for loop iterates over chars in reverse order. If char != ' ', we count chars.
        //if char = ' ', we return the quantity of chars
        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i) != ' '){
                lengthOfLastWord++;
            }else{
                if(lengthOfLastWord>0){
                    return lengthOfLastWord;
                }
            }

        }
        return lengthOfLastWord;
    }
}
