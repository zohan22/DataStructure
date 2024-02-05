package org.sdag.stacks;

import org.sdag.Person;
import org.sdag.interfaces.IRunner;

public class StackRunner implements IRunner {

    @Override
    public void run() {
        /*ArrayStack<Person> personArrayStack = new ArrayStack<Person>();
        //printMenuStack();
        personArrayStack.print();
        personArrayStack.push(new Person("John", 25));
        personArrayStack.push(new Person("Jane", 24));
        personArrayStack.push(new Person("Jack", 23));
        personArrayStack.push(new Person("Jill", 22));
        personArrayStack.print();
        System.out.println("1---------");
        var persona = personArrayStack.pop();
        personArrayStack.print();
        System.out.println("2---------");
        persona = personArrayStack.top();
        System.out.println("The top of the stacK: " + personArrayStack.top());
        personArrayStack.print();
        System.out.println("3---------");
        persona = personArrayStack.pop();
        personArrayStack.print();*/

        LinkedListStack<Character> characterLinkedListStack = new LinkedListStack<Character>();
        printMenuStack();
        //characterLinkedListStack.size();
        System.out.println("1----------");
        System.out.println("The size of the stacK: " + characterLinkedListStack.size());
        characterLinkedListStack.push('A');
        characterLinkedListStack.push('B');
        characterLinkedListStack.push('C');
        characterLinkedListStack.push('D');
        characterLinkedListStack.print();
        System.out.println("The size of the stacK: " + characterLinkedListStack.size());
        System.out.println("\n");
        System.out.println("2----------");
        characterLinkedListStack.pop();
        characterLinkedListStack.print();
        System.out.println("\n");
        System.out.println("3----------");
        characterLinkedListStack.top();
        System.out.println("The top of the stacK: " + characterLinkedListStack.top());
        characterLinkedListStack.print();
        System.out.println("\n");
        System.out.println("4----------");
        characterLinkedListStack.pop();
        characterLinkedListStack.print();


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
