package org.sdag.queues;

import org.sdag.linkedlists.DoubleEdgeNode;

public class Deque<T> implements IDeque<T>{
    DoubleEdgeNode<T> front;
    DoubleEdgeNode<T> back;
    int size;

    public Deque() {
        back = front = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(T e) {
        DoubleEdgeNode<T> current = new DoubleEdgeNode<>(e);
        if(isEmpty()) {
            front = back = current;
        } else {
            current.next = front;
            front.prev = current;
            front = current;
        }
        size++;
    }

    @Override
    public void addLast(T e) {
        DoubleEdgeNode<T> current = new DoubleEdgeNode<>(e);
        if(isEmpty()) {
            front = back = current;
        } else {
            back.next = current;
            current.prev = back;
            back = current;
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if(isEmpty()) {
            System.out.println("empty queue");
        }
        T aux = front.data;
        front = front.next;
        if(front != null) {
            front.prev = null;
        } else {
            back = null;
        }

        size--;
        return aux;
    }

    @Override
    public T removeLast() {
        if(isEmpty()) {
            System.out.println("empty queue");
        }
        T aux = back.data;
        back = back.prev;
        if(back != null) {
            back.next = null;
        } else {
            front = null;
        }

        size--;
        return aux;
    }

    @Override
    public T first() {
        if(isEmpty()) {
            System.out.println("empty queue");
        }
        return front.data;
    }

    @Override
    public T last() {
        if(isEmpty()) {
            System.out.println("empty queue");
        }
        return back.data;
    }

    @Override
    public void print() {
        DoubleEdgeNode<T> current = front;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}
