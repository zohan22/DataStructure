package org.sdag.queues;

import org.sdag.interfaces.IRunner;

import java.util.Scanner;

public class DoubleQueueHandler implements IRunner {
    Deque<Integer> deque = new Deque<>();
    boolean bool = true;
    @Override
    public void run() {
        while(bool) {
            printDoubleQueue();
            handler();
        }
    }

    public void handler() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Queue size: " + deque.size());
                break;
            case 2:
                System.out.println("Insert an element at the beginning:");
                int element = scanner.nextInt();
                deque.addFirst(element);
                System.out.println("Element add: " + element);
                break;
            case 3:
                System.out.println("Insert an element at the end:");
                int element_2 = scanner.nextInt();
                deque.addLast(element_2);
                System.out.println("Element add: " + element_2);
                break;
            case 4:
                try {
                    int d = deque.removeFirst();
                    System.out.println("Deleted element: "+ d);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                try {
                    int de = deque.removeLast();
                    System.out.println("Deleted element: "+ de);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 6:
                try {
                    int firstElement = deque.first();
                    System.out.println("First element: " + firstElement);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 7:
                try {
                    int lastElement = deque.last();
                    System.out.println("Last element: " + lastElement);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 8:
                deque.print();
                break;
            case 9:
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
    public void printDoubleQueue() {
        System.out.println("Welcome to the Linked List based queue");
        System.out.println("What do you want to do");
        System.out.println("1 - Show the size");
        System.out.println("2 - Add first element");
        System.out.println("3 - Add last element");
        System.out.println("4 - Remove first element");
        System.out.println("5 - Remove last element");
        System.out.println("6 - Show the first element");
        System.out.println("7 - Show the last element");
        System.out.println("8 - Print the linked list queue");
        System.out.println("9 - Exit");
    }
}
