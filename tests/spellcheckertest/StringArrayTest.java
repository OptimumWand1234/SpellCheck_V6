package spellcheckertest;

import myspellchecker.StringArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringArrayTest {
    private StringArray testStringArray;

    @Before
    public void setUp() throws Exception {
        testStringArray = new StringArray();
    }

    @Test
    public void sizeTest() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        assertEquals(2, testStringArray.size());
    }

    @Test
    public void isEmptyTest() {
        assertTrue(testStringArray.isEmpty());
    }

    @Test
    public void getTest() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        assertEquals("Hello", testStringArray.get(0));
    }

    @Test
    public void setTest() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        testStringArray.add("years");
        testStringArray.set(2, "ball");
        assertEquals("ball", testStringArray.get(2));
    }

    @Test
    public void addTest(){
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        testStringArray.add("years");
        assertEquals("years", testStringArray.get(2));
    }

    @Test
    public void insertInMiddle() {
    }

    @Test
    public void insert() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        testStringArray.add("years");
        testStringArray.insert(2, "hello");
        assertEquals("hello", testStringArray.get(2));
        assertEquals("years", testStringArray.get(3));
    }

    @Test
    public void remove() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        testStringArray.add("years");
        testStringArray.add("ball");
        testStringArray.remove(2);
        assertEquals("ball", testStringArray.get(2));
        //assertEquals("years", a.get(3));
    }

    @Test
    public void contains() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        testStringArray.add("years");
        testStringArray.add("ball");
        assertTrue(testStringArray.contains("years"));
    }

    @Test
    public void containsMatchingCase() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        testStringArray.add("years");
        testStringArray.add("ball");
        assertFalse(testStringArray.containsMatchingCase("Ball"));
    }

    @Test
    public void indexOf() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        testStringArray.add("years");
        testStringArray.add("ball");
        assertEquals(2, testStringArray.indexOf("years"));
    }

    @Test
    public void indexOfMatchingCase() {
        testStringArray.add("Hello");
        testStringArray.add("Abhorrent");
        testStringArray.add("years");
        testStringArray.add("ball");
        assertEquals(2, testStringArray.indexOfMatchingCase("years"));
        assertEquals(3, testStringArray.indexOfMatchingCase("ball"));
    }
}