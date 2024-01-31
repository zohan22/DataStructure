package org.sdag.linkedlists;

public class LinkedListFactory {
    public static ILinkedList getLinkedList(String option) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("first");
        list.addLast("last");
        list.addFirst("second");

        switch (option) {
            case "1" :
                System.out.println("Linked Link size is: "+list.size());
                break;
            case "2" :
                list.isEmpty();
                break;
            case "8" :
                list.print();
                break;
            default:
                System.out.println("Incorrect option");
                break;
        }

        /*Node<String> firstString = new Node<String>("first");
        Node<String> secondString = new Node<String>("second");
        Node<Person> person = new Node<Person>(new Person("John",25));*/
        return null;
    }
}
