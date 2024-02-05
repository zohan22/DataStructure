package org.sdag.queues;

public interface IQueue<T> {
    /**
     * Returns the number of elements in the queue.
     * @return number of elements in the queue.
    */
    int size();

    /**
     *Tests whether the queue is empty.
     * @return true if the queue is empty, false otherwise.
    */
    boolean isEmpty();

    /**
     * Tests whether the queue is full.
     * @return true if the queue is full, false otherwise.
     */
    boolean isFull();

    /**
     * Enqueue method of the queue.
     * Inserts an element at the rear of the queue
     * @param e the element to be inserted
     */
    void enqueue(T e);

    /**
     * Dequeue method of the queue
     * Removes and returns the first element of the queue.
     * @return element removed (or null if empty).
     * @throws Exception If the queue is empty.
     */
    T dequeue() throws Exception;

    /**
     * First element of the queue.
     * Returns, but does not remove, the first element of the queue.
     * @return first element of the queue (or null if empty).
     * @throws Exception If the queue is empty.
     */
    T first() throws Exception;

    /**
     * Prints the elements of the queue.
     * Prints the elements of the queue from front to back.
     */
    void print();
}
