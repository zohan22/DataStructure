package org.sdag.linkedlists;

public interface IDoubleLinkedList<T> {
    /**
     * Returns the number of elements in the list.
     *
     * @return The number of elements in the list.
     */
    int size();

    /**
     * Tests whether the list is empty.
     *
     * @return True if the list is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns the first element in the list.
     *
     * @return The first element in the list (or null if empty).
     */
    T first();

    /**
     * Returns the last element in the list.
     *
     * @return The last element in the list (or null if empty).
     */
    T last();

    /**
     * Adds an element to the front of the list.
     *
     * @param data The element to be added to the front.
     */
    void addFirst(T data);

    /**
     * Adds an element to the rear of the list.
     *
     * @param data The element to be added to the rear.
     */
    void addLast(T data);

    /**
     * Removes and returns the first element from the list.
     *
     * @return The first element removed (or null if empty).
     */
    T removeFirst();

    /**
     * Removes and returns the last element from the list.
     *
     * @return The last element removed (or null if empty).
     */
    T removeLast();

    /**
     * Prints the elements of the list starting from the head.
     * Prints the elements of the list starting from the front.
     */
    void printHead();

    /**
     * Prints the elements of the list starting from the tail.
     * Prints the elements of the list starting from the rear.
     */
    void printTail();
}
