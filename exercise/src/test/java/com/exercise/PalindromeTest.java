package com.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.exercise.Palindrome;

public class PalindromeTest {
    String palindromes[] = new String[] { "aka", "wow", "123321" };
    String nonPalindromes[] = new String[] { "akaa", "woww", "12ee3321" };

    @Test
    public void testTrueIfRealPalindrome() {
	for (String string : palindromes) {
	    Assert.assertTrue(Palindrome.isPalindrome(string));
	}
    }

    @Test
    public void testFalseIfNotRealPalindrome() {
	for (String string : nonPalindromes) {
	    Assert.assertFalse(Palindrome.isPalindrome(string));
	}
    }
}
