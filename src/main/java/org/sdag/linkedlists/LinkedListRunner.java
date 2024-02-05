package org.sdag.linkedlists;

import org.sdag.interfaces.IRunner;

public class LinkedListRunner implements IRunner {
    @Override
    public void run() {
        printMenuLinkedList();
        //LinkedList<String> list = new LinkedList<String>();
        /*CircularLinkedList<Character> circularList = new CircularLinkedList<Character>();
        circularList.addFirst('A');*/


    }

    public static void printMenuLinkedList() {
        System.out.println("Welcome to the Linkend List");
        System.out.println("What do you want to do?");
        System.out.println("Choose an option: ");
        System.out.println("1 - Simple Linked List");
        System.out.println("2 - Double Linked List");
        System.out.println("3 - Circular Linked List");
        System.out.println("4 - Go Back to Main Menu");

    }
}
