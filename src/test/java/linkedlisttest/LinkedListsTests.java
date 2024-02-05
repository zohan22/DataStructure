package linkedlisttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.Person;
import org.sdag.linkedlists.ILinkedList;
import org.sdag.linkedlists.LinkedList;

public class LinkedListsTests {
    ILinkedList<Person> list = new LinkedList<>();

    @Test
    public void onInitSizeIsZero() {
        Assertions.assertEquals(0, list.size());
    }
    @Test
    public void onInitIsEmpty() {
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void onInsertingFirst() {
        Person person = new Person("John", 20);
        for (int i = 0; i < 10; i++) {
            list.addFirst(person);
        }

        int size = list.size();
        Assertions.assertEquals(10, size);
    }

}
