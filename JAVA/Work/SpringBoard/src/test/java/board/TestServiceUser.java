package board;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceUser;
import board.model.ModelUser;
import board.svc.ServiceUser;

public class TestServiceUser {
    
    private static IServiceUser svc = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new
        ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        // DI를 이용한 serviceuser 인스턴스 생성
        svc = context.getBean("serviceuser", ServiceUser.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelUser user = new ModelUser();
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        
        int rs = svc.getCount(user);
        assertEquals(3, rs);
    }
    
    @Test
    public void testGetMaxUserid() throws Exception {
        int rs = svc.getMaxUserid();
        assertEquals(7, rs);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelUser user = new ModelUser();
        List<ModelUser> rs = svc.selectAll();
        //인스턴스 검증.
        assertNotNull(rs);
        
        //값으로 검증.
        ModelUser m = rs.get(0); 
        assertSame(1, m.getUserid());
        assertEquals("bob", m.getName());
    }
    
    @Test
    public void testSelectLike() throws Exception {
        ModelUser user = new ModelUser();
        user.setName("%k%");
        List<ModelUser> rs = svc.selectLike(user);
        //인스턴스 검증.
        assertNotNull(rs);

        //값으로 검증.
        ModelUser m = rs.get(0); 
        assertSame(2, m.getUserid());
        assertEquals("kim", m.getName());
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelUser user = new ModelUser();
        user.setName("bob");
        List<ModelUser> rs = svc.selectEqual(user);
        //인스턴스 검증.
        assertNotNull(rs);

        //값으로 검증.
        ModelUser m = rs.get(0); 
        assertSame(1, m.getUserid());
        assertEquals("bob", m.getName());
    }
    
    @Test
    public void testInsertUser() throws Exception {
        ModelUser user = new ModelUser();
//        java.sql.Date date = java.sql.Date.valueOf("2017-11-22");
        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.getTime());
        
        user.setUserno(8);
        user.setName("test");
//        user.setInsertDT(cal.getTime());
        
        int rs = svc.insertUser(user);
        assertEquals(1, rs);
    }
    
    @Test
    public void testUpdateUser() throws Exception {
        ModelUser suser = new ModelUser();
        ModelUser wuser = new ModelUser();
        
        suser.setName("test2");
        wuser.setName("test");
        
        int rs = svc.updateUser(wuser, suser);
        assertEquals(1, rs);
    }
    
    @Test
    public void testDeleteUser() throws Exception {
        ModelUser user = new ModelUser();
        user.setUserno(8);
        user.setName("test2");
        
        int rs = svc.deleteUser(user);
        assertEquals(1, rs);
    }
    
    @Test
    public void testSelectDynamic() throws Exception {

    }
    
}
