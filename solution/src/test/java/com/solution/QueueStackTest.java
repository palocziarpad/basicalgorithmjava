package com.solution;

import org.testng.annotations.Test;

public class QueueStackTest {
    @Test
    public void test2x2() {
	QueueStack<String> queueStack = new QueueStack<String>();
	queueStack.add("Geza");
	queueStack.add("Bela");
	System.out.println(queueStack.remove());
	queueStack.add("Jozsi");
	System.out.println(queueStack.remove());
	System.out.println(queueStack.remove());
    }
}
