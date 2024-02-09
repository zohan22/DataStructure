package org.sdag.stacks;

import org.sdag.Person;
import org.sdag.interfaces.IRunner;

import java.util.Scanner;

public class StackRunner implements IRunner {
    Scanner scanner = new Scanner(System.in);
    boolean bool = true;

    @Override
    public void run() {
        while(bool) {
            printMenuStack();
            handleUserChoice();
        }
    }

    private void handleArrayStack() {
        ArrayStackHandler stack = new ArrayStackHandler();
        stack.run();
    }

    private void handleLinkedListStack() {
        LinkedListStackHandler linkedListStack = new LinkedListStackHandler();
        linkedListStack.run();
    }

    public void handleUserChoice() {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                handleArrayStack();
                break;
            case 2:
                handleLinkedListStack();
                break;
            case 3:
                System.out.println("Returning to the main menu.");
                System.out.println("Are you sure want to the return main menu?");
                System.out.println("y/n: ");
                char decide = scanner.next().toLowerCase().charAt(0);
                if(decide == 'y') {
                    bool = false;
                }
                return;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }


    public static void printMenuStack() {
        System.out.println("Welcome to the Stacks");
        System.out.println("What do you want to do?");
        System.out.println("Choose an option: ");
        System.out.println("1 - Array based Stack");
        System.out.println("2 - Linked List based Stack");
        System.out.println("3 - Go Back to Main Menu");
    }
}
