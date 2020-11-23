package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    Object[] averageArray = {1, 10, 3, -1};
    Object[] arrayOfOne = {1};
    Object[] emptyArray = {};

    //    Constructor testing
    @Test
    public void testConstructorEmptyArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(emptyArray);
        int actualLength = 0;
        int expLength = immutableArrayList.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testConstructorEmpty() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        int actualLength = 0;
        int expLength = immutableArrayList.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testConstructorAverageArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(averageArray);
        int actualLength = 4;
        int expLength = immutableArrayList.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testConstructorArrayOfOne() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(arrayOfOne);
        int actualLength = 1;
        int expLength = immutableArrayList.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testAddArrayOfOne() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(arrayOfOne);
        ImmutableArrayList result = immutableArrayList.add(2);
        int actualLength = 2;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testAddArrayOfMany() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.add(2);
        int actualLength = 5;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddNegativeIndexArrayOfMany() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.add(-5, 2);
    }

    @Test
    public void testAddArrayEmpty() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList result = immutableArrayList.add(2);
        int actualLength = 1;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testGetAverageArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.add(0, 2);
        Object actualElement = 2;
        Object expElement = result.get(0);
        assertEquals(actualElement, expElement);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEmpty() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList result = immutableArrayList.add(2);
        Object expElement = result.get(4);
    }

    @Test
    public void testAddIndexAverageArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.add(2, 1);
        Object actualElement = 1;
        int actualLength = 5;
        int expLength = result.size();
        Object expElement = result.get(2);
        assertEquals(actualElement, expElement);
        assertEquals(actualLength, expLength);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndexArrayOfOne() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(arrayOfOne);
        ImmutableArrayList result = immutableArrayList.add(2, 1);
    }

    @Test
    public void testAddAllIndexAverageArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.addAll(2, new Object[]{1, 3});
        Object actualElement2 = 1;
        Object expElement2 = result.get(2);

        Object actualElement3 = 3;
        Object expElement3 = result.get(3);

        Object actualElement5 = -1;
        Object expElement5 = result.get(5);
        int actualLength = 6;
        int expLength = result.size();
        assertEquals(actualElement2, expElement2);
        assertEquals(actualElement3, expElement3);
        assertEquals(actualElement5, expElement5);
        assertEquals(actualLength, expLength);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllIndexEmptyArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList result = immutableArrayList.addAll(2, new Object[]{1, 3});

    }
    @Test
    public void testAddAllIndexArrayOfMany() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.addAll(2, new Object[]{1, 3});
        int actualLength = 6;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testAddAllZeroIndexEmptyArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList result = immutableArrayList.addAll(0, new Object[]{1, 3});

    }

    @Test
    public void testAddAllAverageArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.addAll(new Object[]{1, 3});

        Object actualElement3 = 1;
        Object expElement3 = result.get(4);

        Object actualElement5 = 3;
        Object expElement5 = result.get(5);
        int actualLength = 6;
        int expLength = result.size();

        assertEquals(actualElement3, expElement3);
        assertEquals(actualElement5, expElement5);
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testAddAllEmptyArray() {
        ImmutableArrayList immutableArrayList = new ImmutableArrayList();
        ImmutableArrayList result =
                immutableArrayList.addAll(new Object[]{1, 3});

        Object actualElement3 = 1;
        Object expElement3 = result.get(0);

        Object actualElement5 = 3;
        Object expElement5 = result.get(1);
        int actualLength = 2;
        int expLength = result.size();

        assertEquals(actualElement3, expElement3);
        assertEquals(actualElement5, expElement5);
        assertEquals(actualLength, expLength);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveEmptyArray() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList();
        ImmutableArrayList result = immutableArrayList.remove(1);
        Object expElement3 = result.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetIllegalIndex() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList();
        Object expElement3 = immutableArrayList.get(-1);
    }
    @Test
    public void testRemoveAverageArray() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.remove(1);
        int actualLength = 3;
        int expLength = result.size();
        assertEquals(actualLength, expLength);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetException() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.set(10, 3);
    }

    @Test
    public void testSetAverageArray() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.set(0, 5);

        Object actualElement = 5;
        Object expElement = result.get(0);
        int actualLength = 4;
        int expLength = result.size();

        assertEquals(actualElement, expElement);
        assertEquals(actualLength, expLength);
    }

    @Test
    public void testIndexOfAverageArray() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList(averageArray);
        Object actualElement = 1;
        Object expElement = immutableArrayList.indexOf(10);
        assertEquals(actualElement, expElement);
    }

    @Test
    public void testIndexOfException() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList(averageArray);
        Object actualElement = -1;
        Object expElement = immutableArrayList.indexOf(110);
        assertEquals(actualElement, expElement);
    }

    @Test
    public void testClear() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList(averageArray);
        ImmutableArrayList result = immutableArrayList.clear();
        int actualLength = 0;
        int expLength = result.size();
        assertFalse(immutableArrayList.isEmpty());
        assertEquals(actualLength, expLength);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testToArray() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList(averageArray);
        Object[] result = immutableArrayList.toArray();
        assertEquals(result.length, 4);
    }

    @Test
    public void testToStringAverage() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList(averageArray);
        String result = immutableArrayList.toString();
        assertEquals("1, 10, 3, -1", result);
    }

    @Test
    public void testToStringEmpty() {
        ImmutableArrayList immutableArrayList =
                new ImmutableArrayList();
        String result = immutableArrayList.toString();
        assertEquals("", result);
    }

}
