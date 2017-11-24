package java24.mybatis;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceAuth;
import java24.mybatis.model.ModelAuth;
import java24.mybatis.svr.ServiceAuth;

public class TestServiceAuth {
    
    private static IServiceAuth svc = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new
        ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        // DI를 이용한 serviceauth 인스턴스 생성
        svc = context.getBean("serviceauth", ServiceAuth.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelAuth auth = new ModelAuth();
        
        int rs = svc.getCount(auth);
        assertEquals(3, rs);
    }
    
    @Test
    public void testGetMaxAuthid() throws Exception {
        int rs = svc.getMaxAuthid();
        assertEquals(7, rs);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelAuth auth = new ModelAuth();
        List<ModelAuth> rs = svc.selectAll();
        //인스턴스 검증.
        assertNotNull(rs);
        
        //값으로 검증.
        ModelAuth m = rs.get(0); 
        assertSame(1, m.getAuthid());
        assertEquals("bob", m.getName());
    }
    
    @Test
    public void testSelectLike() throws Exception {
        ModelAuth auth = new ModelAuth();
        auth.setName("%k%");
        List<ModelAuth> rs = svc.selectLike(auth);
        //인스턴스 검증.
        assertNotNull(rs);

        //값으로 검증.
        ModelAuth m = rs.get(0); 
        assertSame(2, m.getAuthid());
        assertEquals("kim", m.getName());
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        List<ModelAuth> rs = svc.selectEqual(auth);
        //인스턴스 검증.
        assertNotNull(rs);

        //값으로 검증.
        ModelAuth m = rs.get(0); 
        assertSame(1, m.getAuthid());
        assertEquals("bob", m.getName());
    }
    
    @Test
    public void testInsertAuth() throws Exception {
        ModelAuth auth = new ModelAuth();
        
        auth.setAuthid(8);
        auth.setName("test");
        auth.setBirth("2017-11-24");
        
        int rs = svc.insertAuth(auth);
        assertEquals(1, rs);
    }
    
    @Test
    public void testUpdateAuth() throws Exception {
        ModelAuth sauth = new ModelAuth();
        ModelAuth wauth = new ModelAuth();
        
        sauth.setName("test2");
        sauth.setBirth("2017-12-31");
        wauth.setAuthid(8);
        wauth.setName("test");
        
        int rs = svc.updateAuth(wauth, sauth);
        assertEquals(1, rs);
    }
    
    @Test
    public void testDeleteAuth() throws Exception {
        ModelAuth auth = new ModelAuth();
        auth.setAuthid(8);
        auth.setName("test2");
        
        int rs = svc.deleteAuth(auth);
        assertEquals(1, rs);
    }
    
    @Test
    public void testSelectDynamic() throws Exception {

    }
    
}
