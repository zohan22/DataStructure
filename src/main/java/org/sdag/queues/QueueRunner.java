package org.sdag.queues;

import org.sdag.interfaces.IRunner;

public class QueueRunner implements IRunner {
    @Override
    public void run() {
        printMenuQueue();
    }

    public void printMenuQueue(){
        System.out.println("Welcome to the Queues");
        System.out.println("What do you want to do?");
        System.out.println("Choose an option: ");
        System.out.println("1 - Array based Queue");
        System.out.println("2 - Linked List based Queue");
        System.out.println("3 - Double-Ended Queue");
        System.out.println("4 - Go Back to Main Menu");
    }
}
