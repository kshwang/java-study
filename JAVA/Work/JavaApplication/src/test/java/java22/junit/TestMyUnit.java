package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMyUnit {
    private static MyUnit myUnit = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        myUnit = new MyUnit();
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @Test
    public void testconcate() {
        String result = myUnit.concate("ab","12");
        assertEquals("ab12",result);
    }
    @Test
    public void testgetBoolean() {
        boolean result = myUnit.getBoolean();
        assertFalse(result);
        assertEquals(false,result);
        assertSame(false, result);
    }
    @Test
    public void testgetSameObject() {
        Object result = myUnit.getSameObject();
        assertNull(result);
        assertEquals(null,result);
        assertSame(null, result);
    }
    @Test
    public void testgetObject() {
        Object result = myUnit.getObject();
        assertNull(result);
        assertEquals(null,result);
        assertSame(null, result);
    }
    // @Ignore 붙이면 테스트가 생략된다.
    @Ignore
    @Test
    public void getStringArray() {
        String[] result  = myUnit.getStringArray();
        String[] result2 = {"one","two","three"};
        assertArrayEquals(result2, result);
    }
    // Exeception 처리 위하여 아래 (expected = ArithmeticException.class) 붙인다.
    @Test(expected = ArithmeticException.class)
    public void testgetExeception() {
        double result = myUnit.getExeception();
    }
    // Exeception 처리 위하여 아래 (expected = ArithmeticException.class) 붙인다.
    @Test(expected = IndexOutOfBoundsException.class)
    public void testgetEmptyList() {
        ArrayList<String> result = myUnit.getEmptyList();
        result.get(0);
    }
    @Test
    public void test() {
        fail("Not yet implemented");
    }
}
