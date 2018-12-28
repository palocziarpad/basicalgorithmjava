package com.solution;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatrixTest {
    @Test
    public void test2x2() {
	int[][] expectedMatrix = new int[][] { { 1, 2 }, { 4, 3 } };
	Assert.assertTrue(Arrays.deepEquals(expectedMatrix, Matrix.makeit(2)));
    }

    @Test
    public void test3x3() {
	int[][] expectedMatrix = new int[][] { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
	Assert.assertTrue(Arrays.deepEquals(expectedMatrix, Matrix.makeit(3)));
    }

    @Test
    public void test4x4() {
	int[][] expectedMatrix = new int[][] { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
	Assert.assertTrue(Arrays.deepEquals(expectedMatrix, Matrix.makeit(4)));
    }
}
