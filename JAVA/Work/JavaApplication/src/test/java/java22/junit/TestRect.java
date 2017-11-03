package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    private static Rect r =null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
        //Rect 클래스의 인스턴스를 만들고
        //인스턴스의 width = 2, height = 30 설정하시오
        r = new Rect();
        r.setWidth(22);
        r.setHeight(30);
    }
    
    @Before
    public void setUp() throws Exception {
        System.out.println();
    }
    
    @Test
    public void test_area() {
  
        int a = r.area();
        assertEquals(60, a);
        assertNotEquals(80, a);
    }
    
    @Test
    public void test_perimeter() {
        //Rect 클래스의 인스턴스를 만들고
        //생성자를 이용하여 필드에 width=2,height=30값설정하시오
        Rect r = new Rect(2, 30);
        
        int p = r.perimeter();
        assertNotEquals(120, p);
        assertEquals(64,p);
    }

    @Test
    public void test_type() {
  
        Object o = r.type();
        assertNull(o);
    }

}