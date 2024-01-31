package org.sdag.stacks;

import org.sdag.linkedlists.LinkedList;
import org.sdag.linkedlists.Node;

public class LinkedListStack<E> implements IStack<E> {
    private Node<E> top;

    private  LinkedList<E> list = new LinkedList<E>();

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int size = 0;
        Node<E> current = top;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(E t) {
        Node<E> current = new Node<>(t);
         current.next = top;
         top = current;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            System.out.println("Stack is empty, can't read top");
        }
        return top.data;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, can't be extracted");
        }
        E aux = top.data;
        top = top.next;
        return aux;
    }

    @Override
    public void print() {
        /*Node<E> current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }*/
        list.print(top);
    }
}


