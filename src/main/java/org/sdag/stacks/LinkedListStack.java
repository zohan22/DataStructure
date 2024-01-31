package org.sdag.stacks;

import org.sdag.linkedlists.LinkedList;

public class LinkedListStack<T> implements IStack<T> {

    private LinkedList<T> list = new LinkedList<T>();

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(T t) {

    }

    @Override
    public T top() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public void print() {
        list.print();
    }
}


