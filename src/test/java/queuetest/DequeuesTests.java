package queuetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.queues.Deque;
import org.sdag.queues.IDeque;

public class DequeuesTests {
    IDeque<String> deque = new Deque<>();

    @Test
    public void testSizeDeque() {
        Assertions.assertEquals(0, deque.size());
        deque.addFirst("hi");
        Assertions.assertEquals(1, deque.size());
        deque.addLast("what");
        Assertions.assertEquals(2, deque.size());
    }

    @Test
    public void testIsEmptyDeque() {
        Assertions.assertTrue(deque.isEmpty());
        deque.addFirst("a");
        Assertions.assertFalse(deque.isEmpty());
    }

    @Test
    public void testAddFirstDeque() {
        deque.addFirst("a");
        Assertions.assertEquals("a", deque.first());
        Assertions.assertEquals("a", deque.last());

        deque.addFirst("movie");
        deque.addFirst("cool");

        Assertions.assertEquals("cool", deque.first());
        Assertions.assertEquals("a", deque.last());
    }

    @Test
    public void testAddLastDeque() {
        deque.addLast("a");
        Assertions.assertEquals("a", deque.first());
        Assertions.assertEquals("a", deque.last());

        deque.addLast("movie");
        deque.addLast("cool");

        Assertions.assertEquals("a", deque.first());
        Assertions.assertEquals("cool", deque.last());
    }


    @Test
    public void testRemoveFirstDeque() {
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        deque.addLast("d");
        deque.addLast("e");
        deque.addLast("f");

        Assertions.assertEquals("c", deque.removeFirst());
        Assertions.assertEquals("b", deque.first());
        Assertions.assertEquals("f",deque.last());
    }

    @Test
    public void testRemoveLastDeque() {
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        deque.addLast("e");
        deque.addLast("f");

        Assertions.assertEquals("f", deque.removeLast());
        Assertions.assertEquals("e", deque.removeLast());
        Assertions.assertEquals("a", deque.removeLast());
        Assertions.assertEquals("c", deque.first());
        Assertions.assertEquals("b",deque.last());
    }

    @Test
    public void testFirstDeque() {
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");

        Assertions.assertEquals("c", deque.first());
    }

    @Test
    public void testLastDeque() {
        deque.addLast("b");
        deque.addLast("a");

        Assertions.assertEquals("a", deque.last());
    }

}
