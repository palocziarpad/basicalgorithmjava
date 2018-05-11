package com.solution;

/***
 * Check if a string is a palindrome or not. A palindrome is a word, number, or
 * other sequence of characters which reads the same backward as forward. Eg.:
 * 11133111 , aka, wow,
 *
 */
public class Palindrome {

    public static boolean isPalindrome(String string) {
	char[] chararray = string.toCharArray();
	for (int i = 0; i < chararray.length / 2; i++) {
	    if (chararray[i] != chararray[chararray.length - 1 - i]) {
		return false;
	    }
	}
	return true;
    }

    public static boolean isPalindrome2(String string) {
	for (int i = 0; i < string.length() / 2; i++) {
	    if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
		return false;
	    }
	}
	return true;
    }
}
