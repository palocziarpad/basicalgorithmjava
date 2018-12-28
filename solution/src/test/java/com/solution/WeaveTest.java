package com.solution;

import org.apache.maven.shared.utils.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WeaveTest {
    @Test
    public void test() {
	QueueInterface<String> first = new Queue<String>();
	first.add("Hello");
	first.add("there");

	QueueInterface<String> second = new Queue<String>();
	second.add("General");
	second.add("Kenobi");
	second.add("Get");
	second.add("him");
	int originalSize = first.size() + second.size();
	QueueInterface<String> weave = Weave.weaveIt(first, second);
	int newSize = weave.size();
	String s = weave.remove();
	while (StringUtils.isNotBlank(s)) {
	    System.out.println(s);
	    s = weave.remove();
	}
	Assert.assertEquals(originalSize, newSize);
    }

}
