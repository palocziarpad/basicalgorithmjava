package com.exercise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class CapitalizeTest {
    @Test
    public void test() {
	String notCapital = " ? sentence with words";
	String capital = " ? Sentence With Words";
	assertEquals(Capitalize.makeIt(notCapital), capital);
	assertNotEquals(Capitalize.makeIt(notCapital), notCapital);
	assertEquals(Capitalize.makeIt2(notCapital), capital);
	assertNotEquals(Capitalize.makeIt2(notCapital), notCapital);
    }

    @Test
    public void test2() {
	String notCapital = "a sentence with words";
	String capital = "A Sentence With Words";
	assertEquals(Capitalize.makeIt(notCapital), capital);
	assertNotEquals(Capitalize.makeIt(notCapital), notCapital);
	assertEquals(Capitalize.makeIt2(notCapital), capital);
	assertNotEquals(Capitalize.makeIt2(notCapital), notCapital);
    }
}
