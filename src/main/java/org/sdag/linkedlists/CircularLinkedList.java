package org.sdag.linkedlists;

public class CircularLinkedList<T> implements ICircularLinkedList<T> {
    CircularNode<T> tail;
    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        CircularNode<T> current = tail.next;
        int size = 1;
        while (current != tail) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public CircularNode<T> first() {
        if(isEmpty()) {
            return null;
        }
        return tail.next;
    }

    @Override
    public CircularNode<T> last() {
        return tail;
    }

    @Override
    public void addFirst(T data) {
        CircularNode<T> current = new CircularNode<T>(data);
        if(isEmpty()){
            tail=current;
            tail.next = current;
        }
        current.next = tail.next;
        tail.next = current;
    }

    @Override
    public void addLast(T data) {
        CircularNode<T> current = new CircularNode<T>(data);
        if(isEmpty()) {
            tail = current;
            tail.next = current;
        } else {
            current.next = tail.next;
            tail.next = current;
            tail = current;
        }
    }

    @Override
    public void removeFirst() {
        if(!isEmpty()){
            if(tail == tail.next) {
                tail = null;
            } else {
                tail.next = tail.next.next;
            }
        }
    }

    @Override
    public void rotate() {
        if(!isEmpty()) {
            tail = tail.next;
        }
    }

    @Override
    public void print() {
        if(isEmpty()) {
            System.out.println("Circular linked list is empty");
        }

        CircularNode<T> current = tail.next;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }
}
