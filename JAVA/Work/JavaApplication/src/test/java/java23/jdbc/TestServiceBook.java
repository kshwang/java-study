package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestServiceBook {
    
    private static ServiceBook svc = null;
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
        svc = new ServiceBook();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelBook model = new ModelBook();
        int result = svc.getCount(model);
        assertEquals(4, result);
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        int result = svc.getMaxBookid();
        assertEquals(4, result);
    }

    @Test
    public void testselectAll() throws SQLException {
        java.sql.ResultSet rs = svc.selectAll();
        
        rs.next(); // ResultSet에서 다음 row로 커서 이동.
        
        int bookid  = rs.getInt("bookid");        
        assertEquals(1, bookid);
        
        String bookname = rs.getString("bookname");
        assertEquals("operating system", bookname);
    }

    @Test
    public void testSelectLike() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("ja");
        
        java.sql.ResultSet rs = svc.selectLike(book);
        
        //인스턴스 검증.
        assertNotNull(rs);
        
        //값을 이용한 검증
        rs.next();
        String name = rs.getString("bookname");
        assertTrue(name.contains("ja"));
        assertTrue(name.contains(book.getBookname()));
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("mysql");
        
        java.sql.ResultSet rs = svc.selectEqual(book);
        
        //인스턴스 검증.
        assertNotNull(rs);
        
        //값을 이용한 검증
        rs.next();
        String name = rs.getString("bookname");
        assertEquals("mysql", name);
        assertEquals(book.getBookname(), name);
        
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        ModelBook book = new ModelBook();
        java.sql.ResultSet rs = null;
        
////////////////////////////////////////////////////////        
        book.setBookid(null);
        book.setBookname("");
        rs = svc.selectDynamic(book);
        assertNotNull(rs);
        
        rs.last();
        int rows = rs.getRow();
        assertEquals(svc.getCount(book), rows);
////////////////////////////////////////////////////////
        
        book.setBookid(1);
        book.setBookname("");
        rs = svc.selectDynamic(book);
        assertNotNull(rs);
        
        rs.next();
        int    bookid = rs.getInt("bookid");
        String booknm = rs.getString("bookname");
        assertEquals(1, bookid);
        assertEquals("operating system", booknm);
////////////////////////////////////////////////////////

        book.setBookid(null);
        book.setBookname("java");
        rs = svc.selectDynamic(book);
        assertNotNull(rs);
        
        rs.next();
        bookid = rs.getInt("bookid");
        booknm = rs.getString("bookname");
        assertEquals(3, bookid);
        assertEquals("java", booknm);
                
    }
    
    @Test
    public void testInsertBook() throws SQLException {
        java.util.Date date1 = new java.util.Date();
        java.sql.Date  date2 = java.sql.Date.valueOf("2017-11-08");
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date2);
        book.setUse_yn(true);
        book.setAuthid(3);
        
        int rslt = svc.insertBook(book);
        
        //insert 검증.
        //Return값(1:성공,0:DB접속실패,-1:코드실패)
        assertEquals(1, rslt);
    }
   
    
    @Test
    public void testUpdateBook() throws SQLException {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test");
        
        ModelBook setbook = new ModelBook();
        setbook.setPrice(15000);
        setbook.setYear("2016");
        
        int rslt = svc.updateBook(wherebook, setbook);

        //update 검증.
        //Return값(1:성공,0:DB접속성공,-1:코드실패)
        assertTrue(rslt >= 0);
        assertEquals(1, rslt);
    }
    
    @Test
    public void testDeleteBook() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("test");
        
        int rslt = svc.deleteBook(book);

        //delete 검증.
        //Return값(1:성공,0:DB접속성공,-1:코드실패)
        assertTrue(rslt >= 0);
        assertEquals(1, rslt);
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }
}
