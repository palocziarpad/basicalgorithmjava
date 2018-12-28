package com.solution;

import java.util.ArrayList;

public class Queue<T> implements QueueInterface<T> {

    ArrayList<T> list;

    public Queue() {
	super();
	list = new ArrayList<T>();
    }

    /* (non-Javadoc)
     * @see com.solution.QueueInterface#add(T)
     */
    @Override
    public void add(T type) {
	list.add(0, type);
    }

    /* (non-Javadoc)
     * @see com.solution.QueueInterface#remove()
     */
    @Override
    public T remove() {
	if (list.size() == 0) {
	    return null;
	}
	int lastindex = list.size() - 1;
	T type = list.get(lastindex);
	list.remove(lastindex);
	return type;
    }

    /* (non-Javadoc)
     * @see com.solution.QueueInterface#size()
     */
    @Override
    public int size() {
	return list.size();
    }
}
