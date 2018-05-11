package com.solution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {
    String palindromes[] = new String[] { "aka", "wow", "123321" };
    String nonPalindromes[] = new String[] { "akaa", "woww", "12ee3321" };

    @Test
    public void testTrueIfRealPalindrome() {
	for (String string : palindromes) {
	    Assert.assertTrue(Palindrome.isPalindrome(string));
	    Assert.assertTrue(Palindrome.isPalindrome2(string));
	}
    }

    @Test
    public void testFalseIfNotRealPalindrome() {
	for (String string : nonPalindromes) {
	    Assert.assertFalse(Palindrome.isPalindrome(string));
	    Assert.assertFalse(Palindrome.isPalindrome2(string));
	}
    }
}
