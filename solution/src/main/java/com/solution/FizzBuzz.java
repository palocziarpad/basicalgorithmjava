package com.solution;

/**
 * "Write a program that prints the numbers from 1 to 100. But for multiples of
 * three print “Fizz” instead of the number and for the multiples of five print
 * “Buzz”. For numbers which are multiples of both three and five print
 * “FizzBuzz”.
 */
public class FizzBuzz {
    public static String[] makeIt() {
	String[] fizzbuzz = new String[100];
	for (int i = 1; i <= 100; i++) {
	    if (i % 5 == 0 && i % 3 == 0) {
		fizzbuzz[i - 1] = "FizzBuzz";
	    } else if (i % 5 == 0) {
		fizzbuzz[i - 1] = "Buzz";
	    } else if (i % 3 == 0) {
		fizzbuzz[i - 1] = "Fizz";
	    } else {
		fizzbuzz[i - 1] = "" + i;
	    }
	    System.out.println(fizzbuzz[i - 1]);
	}
	return fizzbuzz;
    }

}
