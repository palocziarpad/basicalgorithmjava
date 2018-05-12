package com.solution;

/**
 * --- Directions Write a function that accepts a string. The function should
 * capitalize the first letter of each word in the string then return the
 * capitalized string. It is expected the input does not have tailing and
 * leading extra spaces.<br>
 * 
 * 
 * --- Examples
 * 
 * 
 * capitalize('a short sentence') --> 'A Short Sentence'<br>
 * capitalize('a lazy fox') --> 'A Lazy Fox'<br>
 * capitalize('look, it is working!') --> 'Look, It Is Working!'<br>
 *
 */
public class Capitalize {
    public static void main(String[] args) {
	String sentence = "a short sentence";

	System.out.println(makeIt(sentence));
    }

    public static String makeIt(String sentence) {
	char[] charred = sentence.toCharArray();
	charred[0] = Character.toUpperCase(charred[0]);

	for (int i = 1; i < charred.length; i++) {
	    if (charred[i - 1] == ' ') {
		charred[i] = Character.toUpperCase(charred[i]);
	    }
	}
	return String.valueOf(charred);
    }

    public static String makeIt2(String sentence) {
	String[] words = sentence.split(" ");
	for (int i = 0; i < words.length; i++) {
	    if (words[i] == null || words[i].equals("") || words[i].trim().equals("")) {
		continue;
	    }

	    words[i] = Character.toUpperCase(words[i].charAt(0)) + "" + words[i].substring(1);

	}
	return String.join(" ", words);
    }
}
