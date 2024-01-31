package org.sdag.stacks;

import org.sdag.Person;
import org.sdag.interfaces.IRunner;

public class StackRunner implements IRunner {

    @Override
    public void run() {
        ArrayStack<Person> personArrayStack = new ArrayStack<Person>();
        printMenuStack();
        personArrayStack.print();
        personArrayStack.push(new Person("John", 25));
        personArrayStack.push(new Person("Jane", 24));
        personArrayStack.push(new Person("Jack", 23));
        personArrayStack.push(new Person("Jill", 22));
        System.out.println("1---------");
        var persona = personArrayStack.pop();
        personArrayStack.print();
        System.out.println("2---------");
        persona = personArrayStack.top();
        personArrayStack.print();
        System.out.println("3---------");
        persona = personArrayStack.pop();
        personArrayStack.print();
    }

    public static void printMenuStack() {
        System.out.println("Welcome to the Stacks");
        System.out.println("What do you want to do?");
        System.out.println("Choose an option: ");
    }
}
