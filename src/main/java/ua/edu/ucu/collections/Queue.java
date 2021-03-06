package ua.edu.ucu.collections;


import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList elements;
    private int length;

    Queue() {
        length = 0;
        elements = new ImmutableLinkedList();
    }

    public int getLength() {
        return length;
    }

    public Object peek() {
        return elements.getFirst();
    }

    public Object dequeue() {
        length -= 1;
        Object dequeued = elements.getFirst();
        elements = elements.removeFirst();
        return dequeued;
    }

    public void enqueue(Object e) {
        length += 1;
        elements = elements.addLast(e);
    }


}
