package com.solution;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AnagramTest {
    @Test
    public void testPositiveAnagram() {
	// GIVEN
	String first = "Rail safety!";
	String second = " fairy tales";
	// WHEN
	boolean actual = Anagram.isAnagram(first, second);
	// THEN
	assertTrue(actual);
    }

    @Test
    public void testNegativeAnagram() {
	// GIVEN
	String first = "Rail safety!";
	String second = "not fairy tales";
	// WHEN
	boolean actual = Anagram.isAnagram(first, second);
	// THEN
	assertFalse(actual);
    }
}
