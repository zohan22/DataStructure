package org.sdag.linkedlists;

import org.sdag.interfaces.IRunner;

public class LinkedListRunner implements IRunner {
    @Override
    public void run() {
        printMenuLinkedList();
        LinkedListFactory.getLinkedList("1");
        LinkedListFactory.getLinkedList("8");
    }

    public static void printMenuLinkedList() {
        System.out.println("Welcome to the Linkend List");
        System.out.println("What do you want to do?");
        System.out.println("Choose an option: ");
        System.out.println("1 - Show size of Linked List");
        System.out.println("2 - It is empty");
        System.out.println("3 - Show first Node");
        System.out.println("4 - Show last Node");
        System.out.println("5 - Add a new Node at the Begging");
        System.out.println("6 - Add a new Node at the End");
        System.out.println("7 - Remove the first Node");
        System.out.println("8 - Show the Linked List");
    }
}
