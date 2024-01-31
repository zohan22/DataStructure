package org.sdag;

import org.sdag.interfaces.IRunner;

public class Main {
    public static void main(String[] args) {
        printMenu();
        IRunner runner = RunnerFactory.getRunner("B");
        runner.run();
    }

    private static void printMenu() {
        System.out.println("Welcome to the Main Menu");
        System.out.println("Choose a data structure: ");
        System.out.println("A - Linked List");
        System.out.println("B - Stacks");
        System.out.println("C - Queues");
        System.out.println("D - Tress");
        System.out.println("E - Graphs");
        System.out.println("F - 1 Sorting");
        System.out.println("G - 2 Sorting");
        System.out.println("H - 3 Sorting");
    }
}