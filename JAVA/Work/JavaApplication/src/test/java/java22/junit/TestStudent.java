package java22.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestStudent {

    static Student st = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        st = new Student();
    }
    
    @Test
    public void test_grade() {

        assertEquals("A", st.getgrade(100));
        assertEquals("A", st.getgrade(90));

        assertEquals("B", st.getgrade(89));
        assertEquals("B", st.getgrade(80));

        assertEquals("C", st.getgrade(79));
        assertEquals("C", st.getgrade(70));

        assertEquals("D", st.getgrade(69));
        assertEquals("D", st.getgrade(60));

        assertEquals("F", st.getgrade(59));
        assertEquals("F", st.getgrade(0));
    }

}
