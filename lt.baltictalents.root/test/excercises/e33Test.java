package excercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class e33Test {

    @Test
    public void love6() {
        assertTrue(e33.love6(6, 4));
        assertFalse(e33.love6(4, 5));
        assertTrue(e33.love6(1, 5));
    }
}