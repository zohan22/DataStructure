package org.sdag.linkedlists;

public interface ILinkedList<T> {
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
    Node<T> first();

    /**
     * Returns the last node in the list.
     *
     * @return The last node in the list (or null if empty).
     */
    Node<T> last();

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
     * Prints the elements of the list.
     * Prints the elements of the list from front to back.
     */
    void print();

    /**
     * Prints the elements of the list starting from the given node.
     * Prints the elements of the list starting from the specified node.
     *
     * @param node The starting node for printing.
     */
    void print(Node<T> node);
}

