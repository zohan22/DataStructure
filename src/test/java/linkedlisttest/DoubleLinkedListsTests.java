package linkedlisttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.linkedlists.DoubleLinkedList;
import org.sdag.linkedlists.IDoubleLinkedList;

public class DoubleLinkedListsTests {
    IDoubleLinkedList<Integer> doubleList = new DoubleLinkedList<>();

    @Test
    public void testSizeDoubleLinkedList() {
        Assertions.assertEquals(0, doubleList.size());

        doubleList.addFirst(1);
        Assertions.assertEquals(1, doubleList.size());

        doubleList.removeFirst();
        Assertions.assertEquals(0, doubleList.size());
    }

    @Test
    public void testIsEmptyDouble() {
        Assertions.assertTrue(doubleList.isEmpty());

        doubleList.addFirst(1);
        Assertions.assertFalse(doubleList.isEmpty());

        doubleList.removeFirst();
        Assertions.assertTrue(doubleList.isEmpty());
    }

    @Test
    public void testFirstAndLastDouble() {
        Assertions.assertNull(doubleList.first());
        Assertions.assertNull(doubleList.last());

        doubleList.addFirst(1);
        Assertions.assertEquals(1, doubleList.first());
        Assertions.assertEquals(1, doubleList.last());

        doubleList.addLast(2);
        Assertions.assertEquals(1, doubleList.first());
        Assertions.assertEquals(2, doubleList.last());
    }

    @Test
    public void testAddFirstDouble() {
        doubleList.addFirst(1);
        Assertions.assertEquals(1, doubleList.first());
        Assertions.assertEquals(1, doubleList.last());

        doubleList.addFirst(2);
        Assertions.assertEquals(2, doubleList.first());
        Assertions.assertEquals(1, doubleList.last());
    }

    @Test
    public void testAddLastDouble() {
        doubleList.addLast(1);
        Assertions.assertEquals(1, doubleList.first());
        Assertions.assertEquals(1, doubleList.last());

        doubleList.addLast(2);
        Assertions.assertEquals(1, doubleList.first());
        Assertions.assertEquals(2, doubleList.last());
    }

    @Test
    public void testRemoveFirstDouble() {
        doubleList.addLast(1);
        doubleList.addLast(2);

        doubleList.removeFirst();
        Assertions.assertEquals(1, doubleList.size());
        Assertions.assertEquals(2, doubleList.first());
    }

    @Test
    public void testRemoveLastDouble() {
        doubleList.addLast(1);
        doubleList.addLast(2);

        doubleList.removeLast();
        Assertions.assertEquals(1, doubleList.size());
        Assertions.assertEquals(1, doubleList.last());
    }

}
