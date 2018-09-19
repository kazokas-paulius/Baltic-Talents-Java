package lt.baltictalents.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StringCreatorTest {

    @Test
    public void testCreate() {
        assertEquals("PranasStoržievis", StringCreator.create("Pranas", "Storžievis"));
        assertEquals("emptyempty", StringCreator.create("", ""));
        assertEquals("emptynull", StringCreator.create("", null));
        assertEquals("nullnull", StringCreator.create(null, null));
        assertNotNull(StringCreator.create(null, null));
    }

    @Test
    public void testCreateArray(){
        assertEquals("ObuolysAnanasasApelsinas", StringCreator.create(new String[]{"Obuolys", "Ananasas", "Apelsinas"}));
        assertEquals("ObuolysAnanasas", StringCreator.create(new String[]{"Obuolys", "Ananasas"}));
        assertEquals("emptyemptyempty", StringCreator.create(new String[]{"", "", ""}));
        assertEquals("there should be at least 2 strings", StringCreator.create(new String[]{}));
        assertNotNull(StringCreator.create(null));
    }
}