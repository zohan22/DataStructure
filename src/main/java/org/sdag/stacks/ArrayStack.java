package org.sdag.stacks;

public class ArrayStack<E> implements IStack<E> {

    private final E[] array;
    private static final int CAPACITY = 1000;

    private int s = -1;

    public ArrayStack() {
        array = (E[]) new Object[CAPACITY];
    }

    public ArrayStack(int capacity) {
        array = (E[]) new Object[capacity];
    }
    @Override
    public int size() {
        return s + 1;
    }

    @Override
    public boolean isEmpty() {
        return s == -1;
    }

    @Override
    public void push(E e) {
        if(size() == array.length) {
            //throw new IllegalStateException("Stack is full");
            System.out.println("Stack is full");
        }
        array[++s] = e;

    }

    @Override
    public E top() {
        if(isEmpty()) {
            return null;
        }

        return array[s];
    }

    @Override
    public E pop() {
        if(isEmpty()) {
            return null;
        }

        E e = array[s];
        array[s] = null;
        s--;

        return e;
    }

    @Override
    public void print() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = size() - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
