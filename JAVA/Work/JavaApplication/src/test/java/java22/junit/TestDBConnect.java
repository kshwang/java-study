package java22.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java23.jdbc.DBConnect;

public class TestDBConnect {
    
    @Test
    public void test_connectionMySQL() throws Exception {
        java.sql.Connection conn = DBConnect.connectionMySQL();
        
        if(conn != null) {
            assertTrue("db connect success", true);
            
        }
        else {
            assertTrue("db connect fail", false);
            
        }
    }
    @Test
    public void test_makeConnection() throws Exception{
        java.sql.Connection conn = DBConnect.makeConnection();
        
        if(conn != null) {
            assertTrue("db connect success", true);
            
           }
           else {
               assertTrue("db connect fail", false);
               
           }
    }
    
}

