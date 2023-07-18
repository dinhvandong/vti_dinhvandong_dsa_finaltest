package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        char ch1 = '5';
        char ch2 = '@';

        boolean result1 = Character.isLetter(ch1);  // Returns false
        boolean result2 = Character.isLetter(ch2);  // Returns true

        System.out.println(ch1 + " is a letter: " + result1);
        System.out.println(ch2 + " is a letter: " + result2);
    }

   static  boolean isNormal(char c){
        // 0-9
       // Aa Bb Cc Ww.
       if(Character.isDigit(c) || Character.isLetter(c)){
           return true;
       }
        return false;
    }
}