package org.sdag.queues;

import org.sdag.linkedlists.Node;

public class LinkedListQueue<T> implements IQueue<T>{
    Node<T> front;
    Node<T> back;
    int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public boolean isFull() {
        return true;
    }

    @Override
    public void enqueue(T e) {
        Node<T> current = new Node<T>(e);
        if(isEmpty()) {
            front = current;
        } else {
            back.next = current;
        }
        back = current;
        size++;
    }

    @Override
    public T dequeue() throws Exception {
        T aux;
        if(!isEmpty()) {
            aux = front.data;
            front = front.next;
            size--;
        } else {
            throw new Exception("There are no items in the queue");
        }
        return aux;
    }

    @Override
    public T first() throws Exception {
        if(isEmpty()) {
            throw new Exception("Mistake: empty queue");
        }
        return front.data;
    }

    @Override
    public void print() {
        Node<T> current = front;
        while(current != null) {
            System.out.print(current.data);
            if(current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
