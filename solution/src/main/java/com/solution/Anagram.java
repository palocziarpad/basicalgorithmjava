package com.solution;

import java.util.regex.Pattern;

// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False
public class Anagram {
    public static boolean isAnagram(String first, String second) {

	first = removePunctuation(first);
	second = removePunctuation(second);

	if (second.length() != first.length()) {
	    return false;
	}
	for (int i = 0; i < second.length(); i++) {
	    if (!first.toLowerCase().contains("" + second.toLowerCase().charAt(i))) {
		return false;
	    } else {
		first = first.replaceFirst("" + second.toLowerCase().charAt(i), "");
	    }
	}
	return true;
    }

    private static String removePunctuation(String sentence) {
	char[] withoutpunc = sentence.toCharArray();
	for (int i = 0; i < withoutpunc.length; i++) {
	    if (Pattern.matches("\\p{IsPunctuation}", withoutpunc[i] + "")) {
		withoutpunc[i] = ' ';
	    }
	}
	return String.valueOf(withoutpunc).replaceAll(" ", "");
    }
}
