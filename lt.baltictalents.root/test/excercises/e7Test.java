package excercises;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.*;

public class e7Test {

    @Test
    public void testPlusTwo() {
        assertEquals("[1, 2, 3, 4, 7, 9, 1, 3]", Arrays.toString(e7.plusTwo(new int[]{1, 2}, new int[]{3, 4, 7, 9, 1, 3})));
        assertEquals("[4, 2, 2, 5]", Arrays.toString(e7.plusTwo(new int[]{4}, new int[]{2, 2, 5})));
        assertEquals("[9, 2, 1, 8, 3, 4]", Arrays.toString(e7.plusTwo(new int[]{9, 2, 1, 8}, new int[]{3, 4})));
        assertEquals("[]", Arrays.toString(e7.plusTwo(new int[]{}, new int[]{})));
        assertEquals("[8, 0]", Arrays.toString(e7.plusTwo(null, new int[]{8, 0})));
        assertEquals("[1, 4]",Arrays.toString(e7.plusTwo(new int[]{1, 4}, null)));
        assertEquals("null",Arrays.toString(e7.plusTwo(null, null)));
    }
}