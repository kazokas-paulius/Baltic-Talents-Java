package excercises;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class e25Test {

    @Test
    public void testNoYY() {
        assertEquals("[ay, by, cy]" ,e25.noYY(Arrays.asList("a", "b", "c")).toString());

        List<String> result = e25.noYY(Arrays.asList("a", "b", "cy"));
        assertEquals(2, result.size());
        assertEquals("ay", result.get(0));
        assertEquals("by", result.get(1));

        assertEquals("[xxy, yay, zzy]" ,e25.noYY(Arrays.asList("xx", "ya", "zz")).toString());
        assertEquals("[]" ,e25.noYY(Collections.emptyList()).toString());
        assertNull(e25.noYY(null));

        assertEquals("[null, null]" ,e25.noYY(Arrays.asList(null, null)).toString());
        assertEquals("[xxxy, null, xy]" ,e25.noYY(Arrays.asList("xxx", null, "x")).toString());
    }
}