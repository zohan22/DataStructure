package org.sdag.stacks;

import org.sdag.interfaces.IRunner;

import java.util.Scanner;

public class ArrayStackHandler implements IRunner {

    ArrayStack<Character> stack = new ArrayStack<>();
    boolean bool = true;

    @Override
    public void run() {
        while (bool) {
            printArrayStack();
            handler();
        }
    }

    public void handler() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Stack size: " + stack.size());
                break;
            case 2:
                System.out.println("Pushes an element onto the stack:");
                char element = scanner.next().toUpperCase().charAt(0);
                stack.push(element);
                System.out.println("Element add: " + element);
                break;
            case 3:
                try {
                    char p = stack.pop();
                    System.out.println("Element remove: " + p);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                try {
                    System.out.println("Top element: " + stack.top());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 5:
                stack.print();
                break;
            case 6:
                System.out.println("Returning to the stack menu.");
                System.out.println("Are you sure want to the return stack menu?");
                System.out.println("y/n");
                char decide = scanner.next().toLowerCase().charAt(0);
                if(decide == 'y') {
                    bool = false;
                }
                return;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    public void printArrayStack() {
        System.out.println("Welcome to the Array Stack");
        System.out.println("What do you want to do");
        System.out.println("1 - Show the size");
        System.out.println("2 - Push an element");
        System.out.println("3 - Pop an element");
        System.out.println("4 - Top element");
        System.out.println("5 - Print the stack");
        System.out.println("6 - Exit");
    }
}
