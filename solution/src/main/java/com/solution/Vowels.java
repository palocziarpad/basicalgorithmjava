package com.solution;

//--- Directions
//Write a function that returns the number of vowels
//used in a string.  Vowels are the characters 'a', 'e'
//'i', 'o', and 'u'.
//--- Examples
//vowels('Hi There!') --> 3
//vowels('Why do you ask?') --> 4
//vowels('Why?') --> 0
public class Vowels {
    private static final String vowels = "aeiou";

    public static int numberOfVowels(String input) {
	int counter = 0;
	String inputlower = input.toLowerCase();
	for (int i = 0; i < inputlower.length(); i++) {
	    if (vowels.contains("" + inputlower.charAt(i))) {
		counter++;
	    }
	}
	return counter;
    }
}
