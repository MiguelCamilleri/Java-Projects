package org.example;

public class Palindrome {

    public static String isPalindrome(String word){
        String backwards = "";
        String[] letters = word.split("");
        String result = "";

        for(int i = letters.length - 1; i >= 0; i--){
            backwards += letters[i];
        }

        if(word.equals(backwards) && word.length() > 2){
            result = word + " is a palindrome word";
        }
        else if(word.length() < 3){
            result = "Please enter a word with 3 letters or more";
        }
        else {
            result = word + " is not a palindrome word";
        }

        return result;

    }

    public static void main(String[] args){
        System.out.println(isPalindrome("ab"));
    }
}
