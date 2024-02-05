package org.sdag.linkedlists;

public class DoubleEdgeNode<T> {
    public DoubleEdgeNode<T> prev;
    public DoubleEdgeNode<T> next;
    public T data;

    public DoubleEdgeNode(T data) {
        this.prev = null;
        this.next = null;
        this.data = data;
    }
}