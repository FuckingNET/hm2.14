import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StringListTest {
    private final StringListImpl stringList = new StringListImpl();

    @Test
    void add() {
        String expected = stringList.add("hello");
        String actual = "hello";
        assertEquals(expected, actual);

    }

    @Test
    void testAdd() {
        String expected = stringList.add(0, "hello");
        String actual = "hello";
        assertEquals(expected, actual);
    }

    @Test
    void set() {
        String expected = stringList.set(0, "hi");
        String actual = "hi";
        assertEquals(expected, actual);
    }

    @Test
    void remove() {
        stringList.add("hello");
        String expected = stringList.remove("hello");
        String actual = "hello";
        assertEquals(expected, actual);
    }

    @Test
    void testRemove() {
        stringList.add("hello");
        String expected = stringList.remove(0);
        String actual = "hello";
        assertEquals(expected, actual);
    }

    @Test
    void contains() {
        stringList.add("hello");
        boolean expected = stringList.contains("hello");
        boolean actual = true;
        assertEquals(expected, actual);
    }

    @Test
    void indexOf() {
        stringList.add("hello");
        int expected = stringList.indexOf("hello");
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    void lastIndexOf() {
        stringList.add("hello");
        int expected = stringList.lastIndexOf("hello");
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    void get() {
        stringList.add("hello");
        String expected = stringList.get(0);
        String actual = "hello";
        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        stringList.add("hello");
        StringList strings = new StringListImpl();
        strings.add("hello");

        boolean expected = stringList.equals(strings);
        boolean actual = true;
        assertEquals(expected, actual);
    }

    @Test
    void size() {
        int expected = stringList.size();
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        boolean expected = stringList.isEmpty();
        boolean actual = true;
        assertEquals(expected, actual);
    }

    @Test
    void clear() {
        stringList.add("hello");
        stringList.clear();
        int expected = stringList.size();
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    void toArray() {
        stringList.add("hi");
        stringList.add("hello");
        String[] expected = stringList.toArray();
        String[] actual = {"hi", "hello"};
        assertArrayEquals(expected, actual);
    }
}