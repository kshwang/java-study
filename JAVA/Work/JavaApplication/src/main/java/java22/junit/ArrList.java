package java22.junit;

import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;

public class ArrList {
    
    private static List<String> emplist = null;

    @BeforeClass
    public static void setUpClass() {
        
        emplist = new ArrayList<String>();
        emplist.add( "0");
        emplist.add( "2");
        emplist.add( "1");
        emplist.add( "3");
        emplist.add( "4");
    }        

}
