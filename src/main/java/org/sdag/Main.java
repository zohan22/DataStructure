package org.sdag;

import org.sdag.interfaces.IRunner;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {
            printMenu();
            String data = JOptionPane.showInputDialog("Enter a menu option: ");
            IRunner runner = RunnerFactory.getRunner(data.toUpperCase());
            runner.run();
        }
    }

    private static void printMenu() {
        System.out.println("Welcome to the Main Menu");
        System.out.println("Choose a data structure: ");
        System.out.println("A - Linked List");
        System.out.println("B - Stacks");
        System.out.println("C - Queues");
        System.out.println("D - Trees");
        System.out.println("E - Graphs");
        System.out.println("F - 1 MergeSort");
        System.out.println("G - 2 QuickSort");
        System.out.println("H - 3 BubbleSort");
        System.out.println("I - Exit");
    }
}