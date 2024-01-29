package org.sdag.linkedlists;

public class LinkedList implements ILinkedList {
    Node head;
    //Show the size of the linked list
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }

        int size = 0;
        Node current = head;
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
    public Node first() {
        return head;
    }

    @Override
    public Node last() {
        Node current = head;
        while(current != null) {
            if (current.next == null) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    @Override
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    @Override
    public void addLast(int data) {
        Node lastNode = last();

        if(lastNode == null) {
            head = new Node(data);
            return;
        }

        lastNode.next = new Node(data);
    }
    @Override
    public void removeFirst() {

    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

