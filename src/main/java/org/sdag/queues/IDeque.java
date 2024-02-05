package org.sdag.queues;

public interface IDeque<T> {
    /**
     * Returns the number of elements in the deque.
     *
     * @return The number of elements in the deque.
     */
    int size();

    /**
     * Tests whether the deque is empty.
     *
     * @return True if the deque is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Adds an element to the front of the deque.
     *
     * @param e The element to be added to the front.
     */
    void addFirst(T e);

    /**
     * Adds an element to the rear of the deque.
     *
     * @param e The element to be added to the rear.
     */
    void addLast(T e);

    /**
     * Removes and returns the element at the front of the deque.
     *
     * @return The element removed from the front (or null if empty).
     */
    T removeFirst();

    /**
     * Removes and returns the element at the rear of the deque.
     *
     * @return The element removed from the rear (or null if empty).
     */
    T removeLast();

    /**
     * Returns the element at the front of the deque without removing it.
     *
     * @return The element at the front (or null if empty).
     */
    T first();

    /**
     * Returns the element at the rear of the deque without removing it.
     *
     * @return The element at the rear (or null if empty).
     */
    T last();

    /**
     * Prints the elements of the deque from front to back.
     * Prints the elements of the deque in the order they would be dequeued.
     */
    void print();
}
