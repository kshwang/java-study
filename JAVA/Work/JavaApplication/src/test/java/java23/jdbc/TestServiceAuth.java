package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.ModelAuth;
import java23.jdbc.ServiceAuth;

public class TestServiceAuth {
    
    private static ServiceAuth svc = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        svc = new ServiceAuth();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelAuth auth = null;
        int rs = svc.getCount(auth);
        
        assertEquals(4, rs);
    }
    
    @Test
    public void testGetMaxAuthid() throws SQLException {
        ModelAuth auth = null;
        int rs = svc.getMaxAuthid();
        
        assertEquals(20, rs);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        ResultSet rs = svc.selectAll();
        assertNotNull(rs);
        
        ModelAuth auth = null;
        int count = svc.getCount(auth);
        rs.last();
        
        int countset = rs.getRow();
        assertEquals(count, countset);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("bo");
        ResultSet rs = svc.selectLike(auth);
        assertNotNull(rs);
        
        rs.next();
        String name = rs.getString("name");
        assertTrue(name.contains("b"));
        assertTrue(name.contains(auth.getName()));
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        ResultSet rs = svc.selectEqual(auth);
        
        rs.next();
        String name = rs.getString("name");
        assertEquals("bob", name);
    }
    
    @Test
    public void testInsertBook() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setAuthid(19);
        auth.setName("test2");
        auth.setBirth("2017.11.15");
        
        int rslt = svc.insertBook(auth);
        
        //insert 검증.
        //Return값(1:성공,0:DB접속실패,-1:코드실패)
        assertEquals(1, rslt);
    }
    
    @Test
    public void testUpdateBook()  throws SQLException {
        ModelAuth whereauth = new ModelAuth();
        whereauth.setAuthid(19);
        
        ModelAuth setauth = new ModelAuth();
        setauth.setName("test22");
        setauth.setBirth("2018.11.15");
        
        int rslt = svc.updateBook(whereauth, setauth);

        //update 검증.
        //Return값(1:성공,0:DB접속성공,-1:코드실패)
        assertTrue(rslt >= 0);
        assertEquals(1, rslt);
    }
    
    @Test
    public void testDeleteBook() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setAuthid(19);
        auth.setName("test22");
        
        int rslt = svc.deleteBook(auth);

        //delete 검증.
        //Return값(1:성공,0:DB접속성공,-1:코드실패)
        assertTrue(rslt >= 0);
        assertEquals(1, rslt);
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setAuthid(1);
        auth.setName("bob");
        ResultSet rs = svc.selectDynamic(auth);
        
        rs.next();
        String name = rs.getString("name");
        assertEquals("bob", name);
    }

}
