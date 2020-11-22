package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList elements;
    private int length;

    Stack() {
        length = 0;
        elements = new ImmutableLinkedList();
    }

    public int getLength() {
        return length;
    }

    public Object peek() {
        return elements.getFirst();
    }

    public Object pop() {
        length -= 1;
        Object popped = elements.getFirst();
        elements = elements.removeFirst();
        return popped;
    }

    public void push(Object e) {
        elements = elements.addFirst(e);
        length += 1;
    }
}