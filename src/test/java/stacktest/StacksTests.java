package stacktest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sdag.linkedlists.Node;
import org.sdag.stacks.IStack;
import org.sdag.stacks.LinkedListStack;

public class StacksTests {
    IStack<Integer> stack = new LinkedListStack<>();

    @Test
    public void testSizeIsZero() {
        Assertions.assertEquals(0, stack.size());
    }

    @Test
    public void testSizeStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int size = stack.size();

        Assertions.assertEquals(3, size);
    }

    @Test
    public void testIsEmptyStack() {
        boolean isEmpty = stack.isEmpty();

        Assertions.assertTrue(isEmpty);
    }

    @Test
    public void testPushStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3, stack.size());
    }

    @Test
    public void testTopStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        int top = stack.top();

        Assertions.assertEquals(4, top);
    }

    @Test
    public void testPopStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int p = stack.pop();

        Assertions.assertEquals(3, p);
        Assertions.assertEquals(2, stack.size());
    }
}
