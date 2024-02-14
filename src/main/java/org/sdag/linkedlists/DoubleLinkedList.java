package org.sdag.linkedlists;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T>{
    private DoubleEdgeNode<T> head;
    private DoubleEdgeNode<T> tail;

    public DoubleLinkedList() {
        head = new DoubleEdgeNode<>(null);
        tail = new DoubleEdgeNode<>(null);
        head.next = tail;
        tail.prev = head;
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
        if (isEmpty()) {
            return null;
        }
        return head.next.data;
    }

    @Override
    public T last() {
        if (isEmpty()) {
            return null;
        }
        return tail.prev.data;
    }

    @Override
    public void addFirst(T data) {
        DoubleEdgeNode<T> current = new DoubleEdgeNode<>(data);
        if (isEmpty()) {
            head.next = current;
            tail.prev = current;
            current.prev = head;
            current.next = tail;
        } else {
            current.next = head.next;
            current.prev = head;
            head.next.prev = current;
            head.next = current;
        }

    }

    @Override
    public void addLast(T data) {
        DoubleEdgeNode<T> current = new DoubleEdgeNode<T>(data);
        if (isEmpty()) {
            head.next = current;
            tail.prev = current;
            current.prev = head;
            current.next = tail;
        } else {
            current.prev = tail.prev;
            current.next = tail;
            tail.prev.next = current;
            tail.prev = current;
        }

    }

    @Override
    public T removeFirst() {
        if(isEmpty()){
            System.out.println("The list is empty. Nothing to remove.");
            return null;
        }

        T aux = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        return aux;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            System.out.println("The list is empty. Nothing to remove.");
            return null;
        }

        T aux = tail.prev.data;
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
        return aux;
    }

    @Override
    public void printHead() {
        if(!isEmpty()) {
            String data = "<=>";
            DoubleEdgeNode<T> current = head.next;
            while (current != null) {
                data = data + "[" + current.data + "]<=>";
                current = current.next;
            }
            System.out.println(data);
        }
    }

    @Override
    public void printTail() {
        if(!isEmpty()) {
            String data = "<=>";
            DoubleEdgeNode<T> current = tail.prev;
            while (current != null) {
                data = data + "[" + current.data + "]<=>";
                current = current.prev;
            }
            System.out.println(data);
        }
    }
}
