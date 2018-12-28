package com.solution;

public interface QueueInterface<T> {

    void add(T type);

    T remove();

    int size();

}