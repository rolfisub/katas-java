package kyu7.findshort;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FShortTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, FShort.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(2, FShort.findShort("turns out random test cases are easier than writing out basic ones or not"));
        assertEquals(1, FShort.findShort("a bc def g"));
        assertEquals(0, FShort.findShort(""));
        assertEquals(4, FShort.findShort("hola"));
    }
}
