package java24.mybatis;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;
import java24.mybatis.svr.ServiceBook;

public class TestServiceBook {
    
    private static IServiceBook svc = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new
        ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        // DI를 이용한 servicebook 인스턴스 생성
        svc = context.getBean("servicebook", ServiceBook.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelBook book = new ModelBook();
        
        int rs = svc.getCount(book);
        assertEquals(4, rs);
    }
    
    @Test
    public void testGetMaxBookid() throws Exception {
        int rs = svc.getMaxBookid();
        assertEquals(4, rs);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelBook book = new ModelBook();
        List<ModelBook> rs = svc.selectAll(book);
        //인스턴스 검증.
        assertNotNull(rs);
        
        //값으로 검증.
        ModelBook m = rs.get(0); 
        assertSame(1, m.getBookid());
        assertEquals("operating system", m.getBookname());
    }
    
    @Test
    public void testSelectLike() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("%sql%");
        List<ModelBook> rs = svc.selectLike(book);
        //인스턴스 검증.
        assertNotNull(rs);

        //값으로 검증.
        ModelBook m = rs.get(0); 
        assertSame(2, m.getBookid());
        assertEquals("mysql", m.getBookname());
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("mysql");
        List<ModelBook> rs = svc.selectEqual(book);
        //인스턴스 검증.
        assertNotNull(rs);

        //값으로 검증.
        ModelBook m = rs.get(0); 
        assertSame(2, m.getBookid());
        assertEquals("mysql", m.getBookname());
    }
    
    @Test
    public void testInsertBook() throws Exception {
        ModelBook book = new ModelBook();
        java.sql.Date date = java.sql.Date.valueOf("2017-11-22");
        
        book.setBookname("test");
        book.setPublisher("test");
        book.setYear("2017");
        book.setPrice(9999);
        book.setDtm(date);
        book.setUse_yn(true);
        book.setAuthid(9);
        
        int rs = svc.insertBook(book);
        assertEquals(5, rs);
    }
    
    @Test
    public void testInsertMap() throws Exception {
        java.sql.Date date = java.sql.Date.valueOf("2017-11-22");
        
        int rs = svc.insertMap("test", date, 8);
        assertEquals(1, rs);
   }        
    
    @Test
    public void testUpdateBook() throws Exception {
        ModelBook sbook = new ModelBook();
        ModelBook wbook = new ModelBook();
        java.sql.Date date = java.sql.Date.valueOf("2017-11-23");
        
        sbook.setBookname("test2");
        sbook.setPublisher("test2");
        sbook.setYear("2017");
        sbook.setPrice(9999);
        sbook.setDtm(date);
        sbook.setUse_yn(true);
        sbook.setAuthid(9);
        wbook.setBookid(8);
        wbook.setBookname("test");
        
        int rs = svc.updateBook(wbook, sbook);
        assertEquals(1, rs);
    }
    
    @Test
    public void testDeleteBook() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookid(8);
        book.setBookname("test2");
        
        int rs = svc.deleteBook(book);
        assertEquals(1, rs);
    }
    
    @Test
    public void testSelectDynamic() throws Exception {

    }
    
}
