package org.sdag.queues;

public interface IDequeue<T> {
    int size();
    boolean isEmpty();
    void addFirst(T e);
    void addLast(T e);
    T removeFirst();
    T removeLast();
    T first();
    T last();
    void print();
}
