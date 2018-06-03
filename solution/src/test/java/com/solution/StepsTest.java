package com.solution;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class StepsTest {
    @Test
    public void testTwoSteps() {
	String linesep = System.getProperty("line.separator");
	String twoSteps = "# " + linesep + "##" + linesep;
	assertEquals(Steps.createSteps(2), twoSteps);
	assertEquals(Steps.createSteps2(2, 0, ""), twoSteps);
    }

    @Test
    public void testThreeSteps() {
	String linesep = System.getProperty("line.separator");
	String threeSteps = "#  " + linesep + "## " + linesep + "###" + linesep;
	assertEquals(Steps.createSteps(3), threeSteps);
	assertEquals(Steps.createSteps2(3, 0, ""), threeSteps);
    }
}
