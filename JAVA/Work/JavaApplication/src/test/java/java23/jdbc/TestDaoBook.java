package java23.jdbc;

import static org.junit.Assert.*;

import java.awt.dnd.MouseDragGestureRecognizer;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoBook {
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        ModelBook model = new ModelBook();
        int result = dao.getCount(model);
        assertEquals(4, result);
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        int result = dao.getMaxBookid();
        assertEquals(4, result);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        java.sql.ResultSet rs = dao.selectAll();
        
        rs.next(); // ResultSet에서 다음 row로 커서 이동.
//      rs.previous(); // 이전 row로 커서 이동.
        
        int bookid  = rs.getInt("bookid");        
        assertEquals(1, bookid);
        
        String bookname = rs.getString("bookname");
        assertEquals("operating system", bookname);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        DaoBook    dao = new DaoBook(conn);
        ModelBook book = new ModelBook();
        book.setBookname("ja");
        
        java.sql.ResultSet rs = dao.selectLike(book);
        
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
        DaoBook    dao = new DaoBook(conn);
        ModelBook book = new ModelBook();
        book.setBookname("mysql");
        
        java.sql.ResultSet rs = dao.selectEqual(book);
        
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
        DaoBook    dao = new DaoBook(conn);
        ModelBook book = new ModelBook();
        
///////////////////////////////        
        book.setBookid(null);
        book.setBookname("");
        java.sql.ResultSet rs = dao.selectDynamic(book);
        //인스턴스 검증.
        assertNotNull(rs);
        //rs.last():다음row,rs.first:첫번째row,rs.last:마지막row,rs.getRow():현재row Index
        //rs.getInt("column"),rs.getString("column"),rs.getBoolena("column"),rs.getdate("column")
        //값을 이용한 검증
        rs.last();
        int rows = rs.getRow();
        assertEquals(dao.getCount(book), rows);
        System.out.println(rs.last()+" : "+rows);
///////////////////////////////        
        
        book.setBookid(1);
        book.setBookname("");
        rs = dao.selectDynamic(book);
        assertNotNull(rs);
        
        rs.next();
        int    bookid = rs.getInt("bookid");
        String booknm = rs.getString("bookname");
        assertEquals(1, bookid);
        assertEquals("operating system", booknm);
///////////////////////////////        
        
        book.setBookid(null);
        book.setBookname("java");
        rs = dao.selectDynamic(book);
        assertNotNull(rs);
        
        rs.next();
        rs.first();
        bookid = rs.getInt("bookid");
        booknm = rs.getString("bookname");
        assertEquals(3, bookid);
        assertEquals("java", booknm);
///////////////////////////////        
        // 네번째 검증. select * from book where 1 = 1 and bookid=2 and bookname ='mysql';
        
        book.setBookid(2);
        book.setBookname("mysql");
        rs = dao.selectDynamic(book);
        assertNotNull(rs);

        rs.next();  // 커서의 위치를 다음 row로 이동.
        rs.first(); // 커서의 위치를 첫번째 row로 이동.
        bookid = rs.getInt("bookid");
        booknm = rs.getString("bookname");
        assertEquals(2, bookid);
        assertEquals("mysql", booknm);
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
        
        DaoBook dao = new DaoBook(conn);
        int rslt = dao.insertBook(book);
        
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
        
        DaoBook dao = new DaoBook(conn);
        int rslt = dao.updateBook(wherebook, setbook);

        //update 검증.
        //Return값(1:성공,0:DB접속성공,-1:코드실패)
        assertTrue(rslt >= 0);
        assertEquals(1, rslt);
    }
    
    @Test
    public void testDeleteBook() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("test");
        
        DaoBook dao = new DaoBook(conn);
        int rslt = dao.deleteBook(book);

        //delete 검증.
        //Return값(1:성공,0:DB접속성공,-1:코드실패)
        assertTrue(rslt >= 0);
        assertEquals(1, rslt);
    }
    
}
