package com.exercise;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FizzBuzzTest {
    @Test
    public void testFewHardcoded() {
	String[] fizzbuzz = FizzBuzz.makeIt();

	Assert.assertEquals("1", fizzbuzz[0]);
	Assert.assertEquals("2", fizzbuzz[1]);
	Assert.assertEquals("Fizz", fizzbuzz[2]);
	Assert.assertEquals("4", fizzbuzz[3]);
	Assert.assertEquals("Buzz", fizzbuzz[4]);
	Assert.assertEquals("FizzBuzz", fizzbuzz[14]);
    }

    @Test
    public void testFizzez() {
	String[] fizzbuzz = FizzBuzz.makeIt();

	for (int i = 2; i < fizzbuzz.length; i += 3) {
	    Assert.assertTrue(fizzbuzz[i].contains("Fizz"));
	}
    }

    @Test
    public void testBuzzez() {
	String[] fizzbuzz = FizzBuzz.makeIt();

	for (int i = 4; i < fizzbuzz.length; i += 5) {
	    Assert.assertTrue(fizzbuzz[i].contains("Buzz"));
	}
    }

    @Test
    public void testFizzBuzzez() {
	String[] fizzbuzz = FizzBuzz.makeIt();
	for (int i = 14; i < fizzbuzz.length; i += 15) {
	    Assert.assertTrue(fizzbuzz[i].contains("FizzBuzz"));
	}
    }
}
