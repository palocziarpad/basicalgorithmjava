package com.solution;

import java.util.ArrayList;

public class Stack<T> {

    ArrayList<T> list;

    public Stack() {
	super();
	list = new ArrayList<T>();
    }

    public void push(T type) {
	list.add(0, type);
    }

    public T pop() {
	if (list.size() == 0) {
	    return null;
	}
	T type = list.get(0);
	list.remove(0);
	return type;
    }

    public int size() {
	return list.size();
    }
}
