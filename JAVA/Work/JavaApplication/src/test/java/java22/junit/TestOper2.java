package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestOper2 {
    private static Oper oper = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        oper = new Oper(2,4);
    }
    
    @Before
    public void setUp() throws Exception {
    }
            
    @Test
    public void testAdd() {
//        oper.setX(2);
//        oper.setY(4);
        int rs = oper.add();
        assertEquals(6, rs);
    }
    @Test
    public void testMinus() {
        int rs = oper.minus();
        assertEquals(-2, rs);
    }
    @Test
    public void testMul() {
        int rs = oper.mul();
        assertEquals(8, rs);
    }
    @Test
    public void testDiv() {
        double rs = oper.div();
        assertEquals(0.5, rs);
    }
    
}
