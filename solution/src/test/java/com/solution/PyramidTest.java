package com.solution;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class PyramidTest {
    @Test
    public void testTwoLevels() {
	String pyramid = Pyramid.pyramid(2);
	String linesep = System.getProperty("line.separator");
	String expected = " # " + linesep + "###" + linesep;
	Assert.assertEquals(expected, pyramid);
    }

    @Test
    public void testThreeLevels() {
	String pyramid = Pyramid.pyramid(3);
	String linesep = System.getProperty("line.separator");
	String expected = "  #  " + linesep + " ### " + linesep + "#####" + linesep;
	Assert.assertEquals(expected, pyramid);
    }
}
