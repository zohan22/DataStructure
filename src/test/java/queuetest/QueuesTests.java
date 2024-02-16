package queuetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.Person;
import org.sdag.queues.ArrayQueue;
import org.sdag.queues.IQueue;
import org.sdag.queues.LinkedListQueue;

public class QueuesTests {
    IQueue<Integer> queue = new LinkedListQueue<>();

    @Test
    public void testSizeQueue() {
        Assertions.assertEquals(0, queue.size());

        for (int i = 1; i <= 10; i++) {
            queue.enqueue(i);
        }

        int size = queue.size();
        int expected = 10;
        Assertions.assertEquals(expected, size);
    }

    @Test
    public void testIsEmptyQueue() {
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        Assertions.assertTrue(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        Assertions.assertFalse(queue.isEmpty());


        Assertions.assertEquals(5, queue.size());
    }

    @Test
    public void testIsFullArrayQueue() {
        IQueue<Integer> qu = new ArrayQueue<>();
        for (int i = 0; i < 20; i++) {
            qu.enqueue(i);
        }
        Assertions.assertTrue(qu.isFull());
    }

    @Test
    public void testDequeue() throws Exception {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        Assertions.assertEquals(3, queue.size());

        int removedElement = queue.dequeue();
        Assertions.assertEquals(1, removedElement);

        Assertions.assertEquals(2, queue.size());
    }

    @Test
    public void testFirstQueueElement() throws Exception {
        IQueue<Person> q = new LinkedListQueue<>();
        var testPerson = new Person("Juan", 1);
        q.enqueue(testPerson);
        Assertions.assertSame(testPerson, q.first());
    }
}
