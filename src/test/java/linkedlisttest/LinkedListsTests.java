package linkedlisttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.Person;
import org.sdag.linkedlists.ILinkedList;
import org.sdag.linkedlists.LinkedList;

public class LinkedListsTests {
    ILinkedList<Person> list = new LinkedList<>();

    @Test
    public void testSizeLinkedList() {
        Assertions.assertEquals(0, list.size());

        Person person = new Person("Juan", 23);
        list.addFirst(person);
        list.addFirst(person);
        Assertions.assertEquals(2, list.size());

        list.removeFirst();
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testIsEmptyLinkedList() {
        Assertions.assertTrue(list.isEmpty());

        Person person = new Person("John", 20);
        list.addFirst(person);
        Assertions.assertFalse(list.isEmpty());

        list.removeFirst();
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void testAddFirstLinkedList() {
        Person person = new Person("John", 20);
        for (int i = 0; i < 10; i++) {
            list.addFirst(person);
        }

        int size = list.size();
        Assertions.assertEquals(10, size);
    }

    @Test
    public void testAddLastLinkedList() {
        Person person = new Person("John", 20);
        for (int i = 0; i < 10; i++) {
            list.addLast(person);
        }

        int size = list.size();
        Assertions.assertEquals(10, size);
    }

    @Test
    public void testRemoveFirstLinkedList() {
        list.addLast(new Person("John", 20));
        list.addLast(new Person("Alice", 30));

        list.removeFirst();
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void testFirstLinkedList() {
        Person person1 = new Person("John", 20);
        list.addFirst(person1);
        Assertions.assertEquals(person1, list.first().data);

        Person person2 = new Person("Alice", 30);
        list.addFirst(person2);
        Assertions.assertEquals(person2, list.first().data);
    }

    @Test
    public void testLastLinkedList() {
        Person person1 = new Person("John", 20);
        list.addFirst(person1);
        Assertions.assertEquals(person1, list.last().data);

        Person person2 = new Person("Alice", 30);
        list.addLast(person2);
        Assertions.assertEquals(person2, list.last().data);
    }

}
