package org.sdag.queues;

public class ArrayQueue<T> implements IQueue<T> {
    private static final int CAPACITY = 20;
    int front;
    int back;
    int size;
    private  T[] listArray;

    public ArrayQueue(){
        listArray = (T[]) new Object[CAPACITY];
        front = 0;
        back = -1;
        size = 0;
    }
    public ArrayQueue(int capacity) {
        listArray = (T[]) new Object[capacity];
        front = 0;
        back = -1;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front > back;
    }

    @Override
    public boolean isFull() {
        return back == CAPACITY - 1;
    }

    @Override
    public void enqueue(T e) {
        if(!isFull()){
            listArray[++back] = e;
            size++;
        } else {
            System.out.println("The queue is overflow");
        }
    }

    @Override
    public T dequeue() throws Exception {
        if(!isEmpty()) {
            size--;
            return listArray[front++];
        } else {
           throw new Exception("The queue is empty");
        }
    }

    @Override
    public T first() throws Exception {
        if(!isEmpty()) {
            return listArray[front];
        }
        else {
            throw new Exception("The queue is empty");
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }

        for (int i = front; i <= back; i++) {
            System.out.print(listArray[i] + " ");
        }
        System.out.println();
    }
}
