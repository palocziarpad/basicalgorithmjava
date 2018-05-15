package com.solution;

//--- Directions
//Write a function that accepts a positive number N.
//The function should create a step shape String
//with N levels using the # character.  Make sure the
//step has spaces on the right hand side! The last step 
//can have extra line break.
//--- Examples
//steps(2)
//    '# '
//    '##
//    '
//steps(3)
//    '#  '
//    '## '
//    '###
//    '
//steps(4)
//    '#   '
//    '##  '
//    '### '
//    '####
//    '
//Original : https://github.com/StephenGrider/AlgoCasts/blob/master/exercises/steps/index.js
public class Steps {

    public static String createSteps(int stepsNumber) {
	String returnValue = "";
	for (int i = 0; i < stepsNumber; i++) {
	    String line = "";
	    for (int j = 0; j < stepsNumber; j++) {
		if (i >= j) {
		    line += "#";
		} else {
		    line += " ";
		}
	    }
	    returnValue += line + "\n";
	}
	return returnValue;
    }

    public static String createSteps2(final int stepsMaxNumber, int actualRow, String stair) {
	String linesepa = System.getProperty("line.separator");
	if (stepsMaxNumber == actualRow) {
	    return stair;
	}
	if (stepsMaxNumber == stair.length()) {
	    return stair + linesepa + createSteps2(stepsMaxNumber, actualRow + 1, "");
	}
	String addition = stair.length() <= actualRow ? "#" : " ";
	return createSteps2(stepsMaxNumber, actualRow, stair + addition);
    }
}
