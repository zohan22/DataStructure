package org.sdag.linkedlists;

public interface ICircularLinkedList<T> {
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
     * Returns the first node in the list.
     *
     * @return The first node in the list (or null if empty).
     */
    CircularNode<T> first();

    /**
     * Returns the last node in the list.
     *
     * @return The last node in the list (or null if empty).
     */
    CircularNode<T> last();

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
     * Removes the first element from the list.
     */
    void removeFirst();

    /**
     * Rotates the circular linked list by moving the tail to the next node.
     */
    void rotate();

    /**
     * Prints the elements of the list from front to back.
     * Prints the elements of the circular linked list in the order they would be dequeued.
     */
    void print();
}
