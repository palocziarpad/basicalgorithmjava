package com.solution;

public class Weave {
    public static <T> QueueInterface<T> weaveIt(QueueInterface<T> first, QueueInterface<T> second) {
	QueueInterface<T> weaved = new Queue<T>();
	T firstselement = first.remove();
	T secondsselement = second.remove();
	while (firstselement != null || secondsselement != null) {

	    if (firstselement != null) {
		weaved.add(firstselement);
		firstselement = first.remove();
	    }
	    if (secondsselement != null) {
		weaved.add(secondsselement);
		secondsselement = second.remove();
	    }
	}
	return weaved;
    }
}
