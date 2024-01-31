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
    public DoubleEdgeNode<T> first() {
        return null;
    }

    @Override
    public DoubleEdgeNode<T> last() {
        return null;
    }

    @Override
    public void addFirst(T data) {

    }

    @Override
    public void addLast(T data) {

    }

    @Override
    public void removeFirst() {
        if(head == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }

    @Override
    public void removeLast() {
        if(tail == null){
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }
}
