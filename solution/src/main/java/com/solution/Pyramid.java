package com.solution;

//--- Directions
//Write a function that accepts a positive number N.
//The function should console log a pyramid shape
//with N levels using the # character.  Make sure the
//pyramid has spaces on both the left *and* right hand sides
//--- Examples
//pyramid(1)
//    '#'
//pyramid(2)
//    ' # '
//    '###'
//pyramid(3)
//    '  #  '
//    ' ### '
//    '#####'

public class Pyramid {

    public static String pyramid(int levels) {
	String linesep = System.getProperty("line.separator");
	// 1 3 5 7 9
	int row = levels;
	// 1 + (levels-1 )* 2
	// simplier 2*level -1
	// int col = 1 + (levels - 1) * 2;
	int col = levels * 2 - 1;
	char[] pyramidLevel = new char[col];
	String fullPyramid = "";
	for (int rowindex = 1; rowindex <= row; rowindex++) {

	    for (int i = 0; i < pyramidLevel.length; i++) {
		// rowindex = 1, then 3 maxrow-rowindex *2
		// rowindex = 2, then 234
		// rowindex = 3, then 12345
		if (i < row - rowindex || i + 1 > col - (row - rowindex)) {
		    pyramidLevel[i] = ' ';
		} else {
		    pyramidLevel[i] = '#';
		}

	    }
	    fullPyramid += String.valueOf(pyramidLevel) + linesep;
	}
	return fullPyramid;
    }

}
