package miriam.sanz.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class C32Test {

    private C32 c;

    @Before
    public void before() {
        c = new C32();
    }

    @Test
    public void testMa() {
        assertEquals("mA", c.mA());
    }
}
