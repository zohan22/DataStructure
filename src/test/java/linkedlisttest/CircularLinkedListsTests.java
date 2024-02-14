package linkedlisttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.linkedlists.CircularLinkedList;
import org.sdag.linkedlists.CircularNode;
import org.sdag.linkedlists.ICircularLinkedList;

public class CircularLinkedListsTests {
    ICircularLinkedList<Character> list = new CircularLinkedList<>();

    @Test
    public void testSizeWhenIsEmpty() {
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void testSizeAfterAddingElements() {
        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
        Assertions.assertEquals(3, list.size());
    }

    @Test
    public void testIsEmptyWhenIsEmpty() {
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmptyAfterAddingElements() {
        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    public void testFirstWhenEmpty() {
        Assertions.assertNull(list.first());
    }

    @Test
    public void testFirstAfterAddingElements() {
        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
        Assertions.assertEquals('A', list.first().data);
    }

    @Test
    public void testLastWhenEmpty() {
        Assertions.assertNull(list.last());
    }

    @Test
    public void testLastAfterAddingElements() {
        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
        Assertions.assertEquals('C', list.last().data);
    }

    @Test
    public void testAddFirst() {
        list.addFirst('A');
        list.addFirst('B');
        list.addFirst('C');
        Assertions.assertEquals('C', list.first().data);
        Assertions.assertEquals('A', list.last().data);
    }

    @Test
    public void testAddLast() {
        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
        Assertions.assertEquals('A', list.first().data);
        Assertions.assertEquals('C', list.last().data);
    }

    @Test
    public void testRemoveFirstWhenEmpty() {
        list.removeFirst();
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveFirstWithSingleElement() {
        list.addLast('C');
        list.removeFirst();
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveFirstWithMultipleElements() {
        list.addLast('5');
        list.addLast('1');
        list.addLast('2');
        list.removeFirst();

        Assertions.assertEquals(2, list.size());
    }

    @Test
    public void testRotateWithMultipleElements() {
        ICircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.rotate();

        int first = list.first().next.data;


        Assertions.assertEquals(15, first);
    }

    @Test
    public void testRotateWithMultipleElements2() {
        ICircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);

        CircularNode<Integer> originalFirst = list.first();
        CircularNode<Integer> originalLast = list.last();

        list.rotate();

        Assertions.assertEquals(originalFirst.data, list.last().data);

        Assertions.assertEquals(originalFirst.next.data, list.first().data);

        Assertions.assertEquals(originalLast.data, list.first().next.data);
    }
}
