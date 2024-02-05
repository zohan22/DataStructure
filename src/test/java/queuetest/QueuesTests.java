package queuetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.Person;
import org.sdag.queues.ArrayQueue;
import org.sdag.queues.IQueue;

public class QueuesTests {
    @Test
    public void onInitQueueSizeShouldBeZero() {
        IQueue<Integer> queue = new ArrayQueue<>();
        Assertions.assertEquals(0, queue.size());
    }

    @Test
    public void onInitQueueShouldBeEmpty() {
        IQueue<Integer> queue = new ArrayQueue<>();
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    public void onInitQueueShouldBeFull() {
        IQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        Assertions.assertTrue(queue.isFull());
    }

    @Test
    public void onInitQueueFirstShouldBeTheSame() throws Exception {
        IQueue<Person> queue = new ArrayQueue<>();
        var testPerson = new Person("Juan", 1);
        queue.enqueue(testPerson);
        Assertions.assertTrue(testPerson == queue.first());
    }
}
