package ua.edu.ucu.collections;

import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testConstructor() {
        Stack stack = new Stack();
        int actualLength = stack.getLength();
        int expectedLength = 0;
        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(2);
        int actualLength = stack.getLength();
        int expectedLength = 1;
        Object actual = stack.peek();
        Object expected = 2;
        assertEquals(expectedLength, actualLength);
        assertEquals(expected, actual);
    }

    @Test
    public void testDequeue() {
        Stack stack = new Stack();
        stack.push(2);
        Object actual = stack.pop();
        Object expected = 2;
        int actualLength = stack.getLength();
        int expectedLength = 0;
        assertEquals(expectedLength, actualLength);
        assertEquals(expected, actual);
    }

    @Test
    public void testEnqueue() {
        Stack stack = new Stack();
        int actualLength = stack.getLength();
        int expectedLength = 0;
        stack.push(2);
        int actualLength1 = stack.getLength();
        int expectedLength1 = 1;
        assertEquals(expectedLength, actualLength);
        assertEquals(expectedLength1, actualLength1);

    }

    StringBuilder result = new StringBuilder();

}
