package miriam.sanz.ecp1.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class C51Test {

    private C51 c;

    @Before
    public void before() {
        c = new C51();
    }

    @Test
    public void testM1() {
        assertEquals("m1", c.m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("m2", c.m2());
    }
}
