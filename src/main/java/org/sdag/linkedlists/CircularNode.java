package org.sdag.linkedlists;

public class CircularNode<T>{
    CircularNode<T> next;
    T data;
    public CircularNode(T data) {
        this.data = data;
        this.next = this;
    }
}
