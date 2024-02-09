package org.sdag.queues;

import org.sdag.interfaces.IRunner;

import java.util.Scanner;

public class ArrayBasedQueueHandler implements IRunner {
    ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
    boolean bool = true;
    public void run() {
        while (bool) {
            printArrayQueue();
            handler();
        }
    }

    public void handler() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Queue size: " + arrayQueue.size());
                break;
            case 2:
                System.out.println("Enter the element to enqueue:");
                int element = scanner.nextInt();
                arrayQueue.enqueue(element);
                System.out.println("Element enqueued: " + element);
                break;
            case 3:
                try {
                    int deque = arrayQueue.dequeue();
                    System.out.println("Dequeued element: "+ deque);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                try {
                    int firstElement = arrayQueue.first();
                    System.out.println("First element: " + firstElement);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                arrayQueue.print();
                break;
            case 6:
                System.out.println("Returning to the queue menu.");
                System.out.println("Are you sure want to the return queue menu?");
                System.out.println("s/n");
                char decide = scanner.next().toLowerCase().charAt(0);
                if(decide == 's') {
                    bool = false;
                }
                return;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
    public void printArrayQueue() {
        System.out.println("Welcome to the Array based queue");
        System.out.println("What do you want to do");
        System.out.println("1 - Show the size");
        System.out.println("2 - Enqueue an element");
        System.out.println("3 - Dequeue an element");
        System.out.println("4 - Show the first element");
        System.out.println("5 - Print the queue");
        System.out.println("6 - Exit");
    }
}
