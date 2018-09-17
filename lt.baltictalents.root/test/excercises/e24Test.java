package excercises;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class e24Test {

    @Test
    public void testNoNeg() {
        assertEquals("[1]", e24.noNeg(Arrays.asList(1, -2)).toString());
        assertEquals("[3, 3]", e24.noNeg(Arrays.asList(-3, -3, 3, 3)).toString());
        assertEquals("[]", e24.noNeg(Arrays.asList(-1, -1, -1)).toString());
        assertEquals("[]", e24.noNeg(Collections.emptyList()).toString());
        assertEquals("[0, 2]", e24.noNeg(Arrays.asList(0, -5, 2)).toString());
        assertNull(e24.noNeg(null));
    }
}