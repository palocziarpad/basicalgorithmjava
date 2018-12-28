package com.solution;

public class QueueStack<T> implements QueueInterface<T> {

    Stack<T> temporary;
    Stack<T> main;

    public QueueStack() {
	super();
	temporary = new Stack<T>();
	main = new Stack<T>();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.solution.QueueInterface#add(T)
     */
    @Override
    public void add(T type) {
	if (temporary.size() == 0 && main.size() == 0) {
	    main.push(type);
	    return;
	}
	T temp = null;

	temp = main.pop();
	while (temp != null) {
	    temporary.push(temp);
	    temp = main.pop();
	}
	temporary.push(type);
	temp = temporary.pop();
	while (temp != null) {
	    main.push(temp);
	    temp = temporary.pop();
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.solution.QueueInterface#remove()
     */
    @Override
    public T remove() {
	if (temporary.size() == 0 && main.size() == 0) {
	    return null;
	}

	return main.pop();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.solution.QueueInterface#size()
     */
    @Override
    public int size() {
	return main.size() == 0 ? temporary.size() : main.size();
    }
}
