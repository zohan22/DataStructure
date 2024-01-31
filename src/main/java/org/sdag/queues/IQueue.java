package org.sdag.queues;

public interface IQueue<T> {

    int size();
    boolean isEmpty();
    void enqueue(T e);
    T dequeue();
    T first();
    void print();
}
