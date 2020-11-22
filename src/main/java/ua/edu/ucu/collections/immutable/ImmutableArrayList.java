package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList {
    private final Object[] elements;
    private final int length;

    public ImmutableArrayList(Object[] list) {
        length = list.length;
        elements = new Object[length];
        System.arraycopy(list, 0, elements, 0, length);
    }

    public ImmutableArrayList() {
        length = 0;
        elements = new Object[length];

    }

    public void checkIndex(int index) {
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void checkAddingIndex(int index) {
        if (index > length) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public ImmutableList add(Object e) {
        return add(length, e);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        return insertValues(index, new Object[]{e});
    }

    public ImmutableList insertValues(int startIndex, Object[] c) {
        checkAddingIndex(startIndex);
        int gapLength = c.length;
        Object[] newArray = new Object[length + gapLength];

        if (startIndex >= 0) System.arraycopy(elements, 0, newArray, 0, startIndex);
        System.arraycopy(c, 0, newArray, startIndex, gapLength);

        if (length - startIndex >= 0)
            System.arraycopy(elements, startIndex, newArray, startIndex + gapLength,
                    length - startIndex);
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return insertValues(length, c);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        return insertValues(index, c);
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return elements[index];
    }

    @Override
    public ImmutableList remove(int index) {
        checkIndex(index);
        Object[] newArray = new Object[length - 1];

        ImmutableArrayList newImmutable = new ImmutableArrayList();
        System.arraycopy(elements, 0, newArray, 0, index);
        System.arraycopy(elements, index + 1, newArray, index, length - index);
        return newImmutable.add(newArray);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        Object[] newArray = new Object[length];
        System.arraycopy(elements, 0, newArray, 0, length);
        newArray[index] = e;
        return new ImmutableArrayList(newArray);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < length; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return length < 1;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[length];
        System.arraycopy(elements, 0, newArray, 0, length);
        return newArray;
    }

    @Override
    public String toString() {
        if (length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(elements[i]);
            result.append(", ");
        }
        return result.substring(0, result.length() - 2);

    }
}
