package excercises;

import org.junit.Test;

import java.util.Collections;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class e1Test {

    @Test
    public void testDubling() {
        assertEquals("[2, 4, 6]", e1.dubling(Arrays.asList(1, 2, 3)).toString());
        assertEquals("[12, 16, 12, 16, -2]", e1.dubling(Arrays.asList(6, 8, 6, 8, -1)).toString());
        assertEquals("[]", e1.dubling(Collections.emptyList()).toString());
        assertNull(e1.dubling(null));
    }
}