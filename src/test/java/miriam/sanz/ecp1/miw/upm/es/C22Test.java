package miriam.sanz.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {

    private C22 c;

    @Before
    public void before() {
        c = new C22();
    }

    @Test
    public void testMa() {
        assertEquals("mA", c.mA());
    }

}
