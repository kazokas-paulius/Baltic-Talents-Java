package excercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class e8Test {

    @Test
    public void unlucky() {
        assertTrue(e8.unlucky(new int[]{1, 3, 4, 5}));
        assertTrue(e8.unlucky(new int[]{2, 1, 3, 4, 5}));
        assertFalse(e8.unlucky(new int[]{1, 1, 1}));
    }
}