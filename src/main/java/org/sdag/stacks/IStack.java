package org.sdag.stacks;

public interface IStack<E> {
    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    int size();

    /**
     * Tests whether the stack is empty.
     *
     * @return True if the stack is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Pushes an element onto the stack.
     *
     * @param e The element to be pushed onto the stack.
     */
    void push(E e);

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return The element at the top of the stack (or null if empty).
     */
    E top();

    /**
     * Pops and returns the element at the top of the stack.
     *
     * @return The element popped from the top of the stack (or null if empty).
     */
    E pop();

    /**
     * Prints the elements of the stack.
     * Prints the elements of the stack in the order they would be popped.
     */
    void print();
}
