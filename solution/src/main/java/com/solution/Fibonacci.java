package com.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * https://stackoverflow.com/questions/8965006/java-recursive-fibonacci-sequence
 * 
 * fibonacci(2) = fibonacci(1) + fibonacci(0) fibonacci(3) = fibonacci(2) +
 * fibonacci(1) fibonacci(4) = fibonacci(3) + fibonacci(2) fibonacci(5) =
 * fibonacci(4) + fibonacci(3)
 *
 * fibonacci(1)==1 and fibonacci(0) == 0
 *
 * fibonacci(2) = 1+0 = 1 fibonacci(3) = 1+1 = 2 fibonacci(4) = 2+1 = 3
 * fibonacci(5) = 3+2 = 5
 */
public class Fibonacci {
    static long[] storage;

    public static void FibIter(int n) {
	int first = 0;
	int second = 1;
	System.out.print(first + " ");
	System.out.print(second + " ");
	int temp = 0;
	for (int i = 1; i < n; i++) {
	    System.out.print(first + second + " ");
	    temp = first;
	    first = second;
	    second += temp;
	}
    }

    public static void main(String[] args) {
	Fibonacci.FibIter(20);
	System.out.println();
	long start = System.currentTimeMillis();
	storage = new long[46];
	long recfibresult = Fibonacci.FibRecursiveMemo(45);

	long end = System.currentTimeMillis();
	System.out.println(recfibresult + " result " + " time: "
	        + (new SimpleDateFormat("mm:ss:SSS")).format(new Date(end - start)));
    }

    public static int FibRecursive(int n) {
	if (n <= 1)
	    return n;
	return FibRecursive(n - 1) + FibRecursive(n - 2);
    }

    public static long FibRecursiveMemo(int n) {
	if (n <= 1) {
	    return n;
	}
	if (storage[n] != 0) {
	    return storage[n];
	}
	storage[n] = FibRecursiveMemo(n - 1) + FibRecursiveMemo(n - 2);
	return storage[n];
    }
}
