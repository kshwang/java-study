package junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    private static Oper op = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        op = new Oper();
    }
            
    @Test
    public void test() {
        
        // Oper 클래스의 인스턴스 생성
        Oper op = new Oper(2, 4);
        int  rs = op.add();
        
        assertEquals(6, rs);
        assertNotEquals(8, rs);
        assertTrue(6 == rs);
        assertFalse(8 == rs);

        rs = op.minus();
        
        assertEquals(-2, rs);
        assertNotEquals(2, rs);
        assertTrue(-2 == rs);
        assertFalse(2 == rs);

        rs = op.mul();
        
        assertEquals(8, rs);
        assertNotEquals(6, rs);
        assertTrue(8 == rs);
        assertFalse(6 == rs);

        double rs2 = op.div();
        
        assertEquals(0.5, rs2, 0.1);
        assertNotEquals(2, rs2);
        assertTrue(0.5 == rs2);
        assertFalse(2 == rs2);
    }
    
}
