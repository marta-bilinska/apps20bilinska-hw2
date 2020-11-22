package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    Object[] averageArray = {1, 10, 3, -1};
    Object[] arrayOfOne = {1};
    Object[] emptyArray = {};

    //    Constructor testing
    @Test
    public void testConstructorEmptyArray() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(emptyArray);
        int actualLength = 0;
        int expLength = immutableLinkedList.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testConstructorEmpty() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        int actualLength = 0;
        int expLength = immutableLinkedList.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testConstructorAverageArray() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        int actualLength = 4;
        int expLength = immutableLinkedList.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testGetLast() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        Object last = -1;
        Object expLast = immutableLinkedList.getLast();
        assertEquals(last, expLast);
    }

    @Test
    public void testGetFirst() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        Object first = 1;
        Object expLast = immutableLinkedList.getFirst();
        assertEquals(first, expLast);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetLastEmpty() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        Object expLast = immutableLinkedList.getLast();
    }

    @Test
    public void testGetFirstEmpty() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        Object expLast = immutableLinkedList.getFirst();
        assert (expLast == null);
    }


    @Test
    public void testAddArrayOfOne() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList(arrayOfOne);
        ImmutableLinkedList result = immutableLinkedLis.add(2);
        int actualLength = 2;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testAddArrayOfMany() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        ImmutableLinkedList result = immutableLinkedList.add(2);
        int actualLength = 5;
        int expLength = result.size();
        Object actualElement = 2;
        Object expElement = result.get(4);
        assertEquals(actualLength, expLength);
        assertEquals(actualElement, expElement);
    }

    @Test
    public void testAddArrayEmpty() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList();
        ImmutableLinkedList result = immutableLinkedLis.add(2);
        int actualLength = 1;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testGetAverageArray() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        Object actualElement = 10;
        Object expElement = immutableLinkedList.get(1);
        assertEquals(actualElement, expElement);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetArrayOfOne() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(arrayOfOne);
        Object expElement = immutableLinkedList.get(3);

    }

    @Test
    public void testSetAverageArray() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        ImmutableLinkedList result = immutableLinkedList.set(1, 6);
        Object actualElement = 6;
        Object expElement = result.get(1);
        assertEquals(actualElement, expElement);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetAverageArrayException() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        ImmutableLinkedList result = immutableLinkedList.set(4, 6);
        Object actualElement = 6;
        Object expElement = result.get(1);
        assertEquals(actualElement, expElement);
    }

    @Test
    public void testSize() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(arrayOfOne);
        int actualLength = 1;
        int expLength = immutableLinkedList.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testAddedSize() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(arrayOfOne);
        int actualLength = 2;
        int expLength = immutableLinkedList.addFirst(2).size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testClear() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(arrayOfOne);
        int actualLength = 0;
        int expLength = immutableLinkedList.clear().size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testIndexOf() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        int actual = 2;
        int exp = immutableLinkedList.indexOf(3);
        assertEquals(actual, exp);
    }

    @Test
    public void testIndexOfException() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        int actual = -1;
        int exp = immutableLinkedList.indexOf(33);
        assertEquals(actual, exp);
    }

    @Test
    public void testIsEmpty() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        boolean actual = true;
        boolean exp = immutableLinkedList.isEmpty();
        assertEquals(actual, exp);

    }
    @Test
    public void testIsNotEmpty() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        boolean actual = false;
        boolean exp = immutableLinkedList.isEmpty();
        assertEquals(actual, exp);

    }

    @Test
    public void testIsEmptyAdded() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        immutableLinkedList = immutableLinkedList.add(5);
        immutableLinkedList = immutableLinkedList.remove(0);
        boolean actual1 = true;
        boolean exp1 = immutableLinkedList.isEmpty();
        assertEquals(actual1, exp1);
    }

    @Test
    public void testAddIndexArrayOfOne() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList(arrayOfOne);
        ImmutableLinkedList result = immutableLinkedLis.add(0, 2);
        int actualLength = 2;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testAddIndexesArrayOfMany() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        ImmutableLinkedList result = immutableLinkedList.add(1, 2);
        int actualLength = 5;
        int expLength = result.size();
        Object actualElement = 2;
        Object expElement = result.get(1);
        assertEquals(actualLength, expLength);
        assertEquals(actualElement, expElement);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexArrayEmpty() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList();
        ImmutableLinkedList result = immutableLinkedLis.add(2, 2);

    }

    @Test
    public void testAddAllIndexArrayOfOne() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList(arrayOfOne);
        ImmutableLinkedList result = immutableLinkedLis.addAll(0, averageArray);
        int actualLength = 5;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testAddIndexArrayOfMany() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        ImmutableLinkedList result = immutableLinkedList.addAll(averageArray);
        int actualLength = 8;
        int expLength = result.size();
        Object actualElement = -1;
        Object expElement = result.get(7);
        assertEquals(actualLength, expLength);
        assertEquals(actualElement, expElement);
    }

    @Test
    public void testAddIndexesArrayEmpty() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList();
        ImmutableLinkedList result = immutableLinkedLis.addAll(0, arrayOfOne);
        int actualLength = 1;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexesArrayEmptyException() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList();
        ImmutableLinkedList result = immutableLinkedLis.addAll(10, arrayOfOne);

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveException() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList();
        ImmutableLinkedList result = immutableLinkedLis.remove(10);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveArrayOfMany() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        ImmutableLinkedList result = immutableLinkedList.remove(3);
        Object expElement = result.get(3);

    }

    @Test
    public void testToArrayEmpty() {
        ImmutableLinkedList immutableLinkedLis = new ImmutableLinkedList();
        Object[] result = immutableLinkedLis.toArray();
        int actualLength = 0;
        int expLength = result.length;
        assertEquals(actualLength, expLength);
    }
    @Test
    public void testToArrayAverage() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        Object[] result = immutableLinkedList.toArray();
        int actualLength = 4;
        int expLength = result.length;
        assertEquals(actualLength, expLength);
    }
    @Test
    public void testToStringAverage() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList(averageArray);
        String result = immutableLinkedList.toString();
        assertEquals("1, 10, 3, -1", result);
    }
    @Test
    public void testToStringEmpty() {
        ImmutableLinkedList immutableLinkedList = new ImmutableLinkedList();
        String result = immutableLinkedList.toString();
        assertEquals("", result);
    }

}
