package org.sdag.linkedlists;

public class CircularNode<T>{
    public CircularNode<T> next;
    public T data;
    public CircularNode(T data) {
        this.data = data;
        this.next = this;
    }
}
