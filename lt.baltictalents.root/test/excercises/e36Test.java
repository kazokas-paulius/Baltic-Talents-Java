package excercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class e36Test {

    @Test
    public void wordAppend() {
        assertEquals("a", e36.wordAppend(new String[]{"a", "b", "a"}));
        assertEquals("aa", e36.wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        assertEquals("aa", e36.wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        assertEquals("a", e36.wordAppend(new String[]{"a", "", "a"}));
        assertEquals("a", e36.wordAppend(new String[]{""}));
        assertEquals("a", e36.wordAppend(new String[]{null}));
        assertEquals("a", e36.wordAppend(new String[]{}));
        assertEquals("a", e36.wordAppend(new String[]{null, null}));
    }
}