package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    @DisplayName("test if a word with less than 3 letters returns the correct String")
    public void test1(){
        String expected = "Please enter a word with 3 letters or more";
        String result = Palindrome.isPalindrome("aa");
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("test if a word is palindrome")
    public void test2(){
        String expected = "abba is a palindrome word";
        String result = Palindrome.isPalindrome("abba");
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("test if a word is palindrome")
    public void test3(){
        String expected = "rotator is a palindrome word";
        String result = Palindrome.isPalindrome("rotator");
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("test if a word is palindrome")
    public void test4(){
        String expected = "racecar is a palindrome word";
        String result = Palindrome.isPalindrome("racecar");
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("test if a word is not a palindrome")
    public void test5(){
        String expected = "donkey is not a palindrome word";
        String result = Palindrome.isPalindrome("donkey");
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("test if a word is not a palindrome")
    public void test6(){
        String expected = "mississippi is not a palindrome word";
        String result = Palindrome.isPalindrome("mississippi");
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("test if a word is not a palindrome")
    public void test7(){
        String expected = "hippy is not a palindrome word";
        String result = Palindrome.isPalindrome("hippy");
        Assertions.assertEquals(expected, result);
    }

}