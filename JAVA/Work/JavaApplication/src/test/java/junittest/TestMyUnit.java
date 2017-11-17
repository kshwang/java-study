package junittest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMyUnit {
    private static MyUnit mu = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        mu = new MyUnit();
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void testconcate() {
        String rs = mu.concate("12","34");
        assertEquals("1234",rs);
    }
    
    @Test
    public void testgetBoolean() {
        boolean rs = mu.getBoolean();
        assertFalse(rs);
        assertEquals(false,rs);
        assertSame(false, rs);
    }
    
    @Test
    public void testgetSameObject() {
        Object rs = mu.getSameObject();
        assertNull(rs);
        assertEquals(null,rs);
        assertSame(null, rs);
    }
    
    @Test
    public void testgetObject() {
        Object rs = mu.getObject();
        assertNull(rs);
        assertEquals(null,rs);
        assertSame(null, rs);
    }
    
    // @Ignore 붙이면 테스트가 생략된다.
//  @Ignore
    @Test
    public void testgetStringArray() {
        String[] rs  = mu.getStringArray();
        String[] rs2 = {"one","two","three"};
        assertArrayEquals(rs, rs2);
    }
    
    // Exeception 처리 위하여 아래 (expected = ArithmeticException.class) 붙인다.
    @Test(expected = ArithmeticException.class)
    public void testgetExeception() {
        double rs = mu.getExeception();
    }
    
    // Exeception 처리 위하여 아래 (expected = ArithmeticException.class) 붙인다.
    @Test(expected = IndexOutOfBoundsException.class)
    public void testgetEmptyList() {
        ArrayList<String> rs = mu.getEmptyList();
        rs.get(0);
    }

}
