package com.exercise;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class StepsTest {
    @Test
    public void testTwoSteps() {
	String twoSteps = "# \n##\n";
	assertEquals(Steps.createSteps(2), twoSteps);
	assertEquals(Steps.createSteps2(2, 0, ""), twoSteps);
    }

    @Test
    public void test() {
	String threeSteps = "#  \n## \n###\n";
	assertEquals(Steps.createSteps(3), threeSteps);
	assertEquals(Steps.createSteps2(3, 0, ""), threeSteps);
    }
}
