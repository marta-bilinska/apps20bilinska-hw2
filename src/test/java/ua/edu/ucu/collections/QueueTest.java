package ua.edu.ucu.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testConstructor() {
        Queue q = new Queue();
        int actualLength = q.getLength();
        int expectedLength = 0;
        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void testPeek() {
        Queue q = new Queue();
        q.enqueue(2);
        int actualLength = q.getLength();
        int expectedLength = 1;
        Object actual = q.peek();
        Object expected = 2;
        assertEquals(expectedLength, actualLength);
        assertEquals(expected, actual);
    }

    @Test
    public void testDequeue() {
        Queue q = new Queue();
        q.enqueue(2);
        Object actual = q.dequeue();
        Object expected = 2;
        int actualLength = q.getLength();
        int expectedLength = 0;
        assertEquals(expectedLength, actualLength);
        assertEquals(expected, actual);
    }

    @Test
    public void testEnqueue() {
        Queue q = new Queue();
        int actualLength = q.getLength();
        int expectedLength = 0;
        q.enqueue(2);
        int actualLength1 = q.getLength();
        int expectedLength1 = 1;
        assertEquals(expectedLength, actualLength);
        assertEquals(expectedLength1, actualLength1);

    }
}
