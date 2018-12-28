package com.solution;
//--- Directions

//Write a function that accepts an integer N
//and returns a NxN spiral matrix.
//--- Examples
//matrix(2)
//  [[1, 2],
//  [4, 3]]
//matrix(3)
//  [[1, 2, 3],
//  [8, 9, 4],
//  [7, 6, 5]]
//matrix(4)
//  [[1,   2,  3, 4],
//  [12, 13, 14, 5],
//  [11, 16, 15, 6],
//  [10,  9,  8, 7]]

public class Matrix {
    public static int[][] makeit(int size) {
	int[][] matrix = new int[size][size];
	int maxvalue = size * size;
	int counter = 1;
	int row = 0;
	int column = 0;

	while (counter <= maxvalue) {
	    while (column < size && matrix[row][column] == 0) {
		matrix[row][column] = counter++;
		column++;
	    }
	    column--;
	    row++;
	    while (row < size && matrix[row][column] == 0) {

		matrix[row][column] = counter++;
		row++;
	    }
	    row--;
	    column--;
	    while (column >= 0 && matrix[row][column] == 0) {
		matrix[row][column] = counter++;
		column--;
	    }
	    column++;
	    row--;
	    while (row >= 0 && matrix[row][column] == 0) {
		matrix[row][column] = counter++;
		row--;
	    }
	    row++;
	    column++;
	}
	return matrix;
    }

}
