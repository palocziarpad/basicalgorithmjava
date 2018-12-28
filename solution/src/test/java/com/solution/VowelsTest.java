package com.solution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VowelsTest {
    @Test
    public void test() {
	Assert.assertEquals(4, Vowels.numberOfVowels("Hello there!"));

    }
}
