package org.sdag.linkedlists;

public class LinkedList<T> implements ILinkedList<T> {
    Node<T> head;
    //Show the size of the linked list
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }

        int size = 0;
        Node<T> current = head;
        while(current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Node<T> first() {
        return head;
    }

    @Override
    public Node<T> last() {
        Node<T> current = head;
        while(current != null) {
            if (current.next == null) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    @Override
    public void addLast(T data) {
        Node<T> lastNode = last();

        if(lastNode == null) {
            head = new Node<T>(data);
            return;
        }

        lastNode.next = new Node<T>(data);
    }
    @Override
    public void removeFirst() {
        if(isEmpty()) {
            return;
        }
        head = head.next;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data+" -> ");
            current = current.next;
        }
    }
}