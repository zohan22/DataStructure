package org.sdag.linkedlists;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T>{
    private DoubleEdgeNode<T> head;
    private DoubleEdgeNode<T> tail;

    public DoubleLinkedList() {
        DoubleEdgeNode<T> head = new DoubleEdgeNode<>(null);
        DoubleEdgeNode<T> tail = new DoubleEdgeNode<>(null);
        head.next = tail;
        tail.prev = head;

        this.head = null;
        this.tail = null;
    }

    @Override
    public int size() {
        if(isEmpty()) {
            return 0;
        }

        int size = 0;
        DoubleEdgeNode<T> current = head.next;
        while (current != tail) {
            size++;
            current = current.next;
        }

        return size;
    }

    @Override
    public boolean isEmpty() {
        return head.next == tail;
        //return tail.prev == head;
    }

    @Override
    public T first() {
        return head.data;
    }

    @Override
    public T last() {
        return tail.data;
    }

    @Override
    public void addFirst(T data) {
        DoubleEdgeNode<T> current = new DoubleEdgeNode<T>(data);
        if(isEmpty()) {
            tail = current;
            tail.next = null;
            tail.prev = null;
        } else {
            head.prev = current;
            current.prev = null;
            current.next = head;
        }
        head = current;
    }

    @Override
    public void addLast(T data) {
        DoubleEdgeNode<T> current = new DoubleEdgeNode<T>(data);
        if(isEmpty()) {
            head = current;
            head.next = null;
            head.prev = null;
        } else {
            tail.next = current;
            current.next = null;
            current.prev = tail;
        }
        tail = current;
    }

    @Override
    public T removeFirst() {
        if(head == null){
            System.out.println("The list is empty. Nothing to remove.");
        }
        T aux = head.data;
        head = head.next;
        head.prev = null;
        return aux;
    }

    @Override
    public T removeLast() {
        if(tail == null){
            System.out.println("The list is empty. Nothing to remove.");
        }
        T aux = tail.data;
        tail = tail.prev;
        tail.next = null;
        return aux;
    }

    @Override
    public void printHead() {
        if(!isEmpty()) {
            String data = "<=>";
            DoubleEdgeNode<T> current = head;
            while (current != null) {
                data = data + "["+current.data+"]<=>";
                current = current.next;
            }
        }
    }

    @Override
    public void printTail() {
        if(!isEmpty()) {
            String data = "<=>";
            DoubleEdgeNode<T> current = tail;
            while (current != null) {
                data = data + "["+current.data+"]<=>";
                current = current.prev;
            }
        }
    }
}
