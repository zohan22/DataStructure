package org.sdag.trees;

import org.sdag.interfaces.IRunner;

import java.util.Scanner;

public class TreeRunner implements IRunner {
    BinaryTree tree = new BinaryTree();
    boolean bool = true;
    @Override
    public void run() {
        while (bool){
            printMenuTree();
            handler();
        }
    }

    public void handler() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Tree size: " + tree.size());
                break;
            case 2:
                System.out.println("Tree height: " + tree.height());
                break;
            case 3:
                System.out.println("Enter the element to insert:");
                int element = scanner.nextInt();
                tree.insert(element);
                System.out.println("Element inserted: " + element);
                break;
            case 4:
                System.out.println("Enter the element to search:");
                int searchElement = scanner.nextInt();
                if (tree.search(searchElement)) {
                    System.out.println("Element found in the tree.");
                } else {
                    System.out.println("Element not found in the tree.");
                }
                break;
            case 5:
                System.out.println("Enter the element to delete:");
                int deleteElement = scanner.nextInt();
                tree.delete(deleteElement);
                System.out.println("Element deleted: " + deleteElement);
                break;
            case 6:
                System.out.println("Root of the tree: " + tree.getRoot().toString());
                break;
            case 7:
                System.out.println("Enter the element to get the node:");
                int getNodeElement = scanner.nextInt();
                BTNode node = tree.getNode(getNodeElement);
                if (node != null) {
                    System.out.println("Node containing element " + getNodeElement + ": " + node.data);
                } else {
                    System.out.println("Node containing element " + getNodeElement + " not found.");
                }
                break;
            case 8:
                System.out.println("Preorder traversal:");
                tree.preOrder();
                break;
            case 9:
                System.out.println("Inorder traversal:");
                tree.inOrder();
                break;
            case 10:
                System.out.println("Postorder traversal:");
                tree.postOrder();
                break;
            case 11:
                System.out.println("Printing the tree:");
                tree.print();
                break;
            case 12:
                System.out.println("Exiting the tree menu.");
                System.out.println("Are you sure you want to exit?");
                System.out.println("Enter 'y' to exit or any other key to continue.");
                char decide = scanner.next().toLowerCase().charAt(0);
                if(decide == 'y') {
                    bool = false;
                }
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    public static void printMenuTree() {
        System.out.println("Welcome to the Trees");
        System.out.println("What do you want to do");
        System.out.println("Choose an option: ");
        System.out.println("1 - Show the size");
        System.out.println("2 - Show the height");
        System.out.println("3 - Insert a new element");
        System.out.println("4 - Search an element");
        System.out.println("5 - Delete the element");
        System.out.println("6 - Get the root");
        System.out.println("7 - Get a Node");
        System.out.println("8 - Show PreOrder");
        System.out.println("9 - Show InOrder");
        System.out.println("10 - Show PostOrder");
        System.out.println("11 - Print the Tree");
        System.out.println("12 - Exit");
    }
}
