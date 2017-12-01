package board;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;
import board.model.ModelUser;
import board.svc.ServiceBoard;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceBoard {
    
    private static IServiceBoard svc = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        // DI를 이용한 serviceuser 인스턴스 생성
        svc = context.getBean("serviceboard", ServiceBoard.class);
        
        // DB Table 초기화
        javax.sql.DataSource dataSource = (DataSource) context.getBean("dataSource");
        org.apache.ibatis.jdbc.ScriptRunner runner = new
        org.apache.ibatis.jdbc.ScriptRunner( dataSource.getConnection() );
        runner.setAutoCommit(true);
        runner.setStopOnError(true);
        
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile();
        java.io.Reader br = new java.io.BufferedReader( new java.io.FileReader(sf) );
        runner.runScript(br);
        runner.closeConnection();
    }
    
    @Test
    public void test01_GetBoardName() throws Exception {
        String rs = svc.getBoardName("data");

        //값으로 검증.
        assertNotNull(rs);
        assertEquals("자료실", rs);
    }
    
    @Test
    public void test02_GetBoardOne() throws Exception {
        List<ModelBoard> rs = svc.getBoardOne("data");

        //인스턴스 검증.
        assertNotNull(rs);
        assertEquals(1, rs.size());

        //값으로 검증.
        ModelBoard m = rs.get(0); 
        assertSame(1, m.getUseYN());
        assertEquals("자료실", m.getBoardnm());
    }
    
    @Test
    public void test03_GetBoardList() throws Exception {
        List<ModelBoard> rs = svc.getBoardList();

        //인스턴스 검증.
        assertNotNull(rs);
        assertEquals(3, rs.size());

        //값으로 검증.
        ModelBoard m = rs.get(0); 
        assertSame(1, m.getUseYN());
        assertEquals("QnA게시판", m.getBoardnm());
    }
    
    @Test
    public void test04_InsertBoard() throws Exception {
        ModelBoard mb = new ModelBoard();
        java.sql.Date date = java.sql.Date.valueOf("2017-11-29");

        mb.setBoardcd("test");
        mb.setBoardnm("test name");
        mb.setUseYN(1);
        mb.setInsertUID("UID");
        mb.setInsertDT(date);
        mb.setUpdateUID("UID");
        mb.setUpdateDT(null);

        int rs = svc.insertBoard(mb);
        assertEquals(1, rs);
    }
    
    @Test
    public void test05_UpdateBoard() throws Exception {
        java.sql.Date date = java.sql.Date.valueOf("2017-11-29");
        ModelBoard upval = new ModelBoard();
        ModelBoard scval = new ModelBoard();
        
        upval.setBoardnm("test name");
        upval.setUseYN(0);
        upval.setUpdateUID("UID");
        upval.setUpdateDT(date);
        scval.setBoardcd("test");
        scval.setBoardnm("test name");
        
        int rs = svc.updateBoard(scval,upval);
        assertEquals(1, rs);
    }
    
    @Test
    public void test06_DeleteBoard() throws Exception {
        ModelBoard mb = new ModelBoard();

        mb.setBoardcd("test");
        mb.setBoardnm("test name");
        mb.setUseYN(0);

        int rs = svc.deleteBoard(mb);
        assertEquals(1, rs);
    }
    
    @Test
    public void test07_GetBoardSearch() throws Exception {
        ModelBoard mb = new ModelBoard();

        mb.setBoardcd("d");
        mb.setBoardnm("자");

        List<ModelBoard> rs = svc.getBoardSearch(mb);
        //인스턴스 검증.
        assertNotNull(rs);
        assertEquals(1, rs.size());

        //값으로 검증.
        ModelBoard m = rs.get(0); 
        assertSame(1, m.getUseYN());
        assertEquals("자료실", m.getBoardnm());
    }
    
    @Test
    public void test08_GetBoardTotalRecord() throws Exception {
        int rs = svc.getBoardTotalRecord("data","자료실");

        assertNotNull(rs);
        assertSame(1, rs);
    }
    
    @Test
    public void test09_GetBoardPaging() throws Exception {
        List<ModelBoard> rs = svc.getBoardPaging("data","자료실",1, 10);

        //인스턴스 검증.
        assertNotNull(rs);
        assertEquals(1, rs.size());

        //값으로 검증.
        ModelBoard m = rs.get(0); 
        assertSame(1, m.getUseYN());
        assertEquals("자료실", m.getBoardnm());
    }
    
    @Test
    public void test10_InsertBoardList() throws Exception {
        ModelBoard mb1 = new ModelBoard();
        ModelBoard mb2 = new ModelBoard();
        mb1.setBoardcd("test1");
        mb1.setBoardnm("test1");
        mb1.setUseYN(1);
        mb2.setBoardcd("test2");
        mb2.setBoardnm("test2");
        mb2.setUseYN(1);
       
        List<ModelBoard> lmb = new ArrayList<>();
        lmb.add(mb1);
        lmb.add(mb2);
        int rs = svc.insertBoardList(lmb);

        assertNotNull(rs);
        assertEquals(2, rs);
    }
    
    @Test
    public void test11_GetArticleTotalRecord() throws Exception {
        int rs = -1;
        rs = svc.getArticleTotalRecord("free", "test");
        assertNotEquals(-1, rs);
    }
    
    @Test
    public void test12_GetArticleList() throws Exception {
        List<ModelArticle> rs = null;
        rs = svc.getArticleList("free", "", 0, 1);
        assertNotEquals(0, rs.size());
    }
    
    @Test
    public void test13_GetArticle() throws Exception {
        List<ModelArticle> rs = null;
        rs = svc.getArticle(1);
        assertEquals("article test  01", rs.get(0).getTitle());
    }
    
    @Test
    public void test14_InsertArticle() throws Exception {
        ModelArticle article = new ModelArticle();
        int rs = -1;
        article.setBoardcd("data");
        article.setTitle("tiled");
        rs = svc.insertArticle(article);
        article = new ModelArticle();
        rs = -1;
        article.setBoardcd("data");
        article.setTitle("tile");
        rs = svc.insertArticle(article);
        article = new ModelArticle();
        rs = -1;
        article.setBoardcd("data");
        article.setTitle("tled");
        rs = svc.insertArticle(article);
        article = new ModelArticle();
        rs = -1;
        article.setBoardcd("data");
        article.setTitle("tild");
        rs = svc.insertArticle(article);
        assertNotEquals(-1, rs);
    }
    
    @Test
    public void test15_UpdateArticle() throws Exception {
        ModelArticle searchValue = new ModelArticle();
        searchValue.setBoardcd("data");
        ModelArticle updateValue = new ModelArticle();
        updateValue.setUseYN(0);
        int rs = -1;
        rs = svc.updateArticle(updateValue, searchValue);
        assertNotEquals(-1, rs);
    }
    
    @Test
    public void test16_DeleteArticle() throws Exception {
        ModelArticle article = new ModelArticle();
        article.setBoardcd("data");
        int rs = -1;
        rs = svc.deleteArticle(article);
        assertNotEquals(-1, rs);
    }
    
    @Test
    public void test17_IncreaseHit() throws Exception {
        int rs = -1;
        rs = svc.increaseHit(201);
        assertNotEquals(-1, rs);
        
    }
    
    @Test
    public void test18_GetNextArticle() throws Exception {
        List<ModelArticle> rs = null;
        rs = svc.getNextArticle("free", 100, "test");
        assertTrue(rs.size()>0);
        assertEquals(101, (int)rs.get(0).getArticleno());
    }
    
    @Test
    public void test19_GetPrevArticle() throws Exception {
        List<ModelArticle> rs = null;
        rs = svc.getPrevArticle("free", 100, "test");
        assertTrue(rs.size()>0);
        assertEquals(99, (int)rs.get(0).getArticleno());
    }
    
    @Test
    public void test20_GetAttachFile() throws Exception {
        List<ModelAttachFile> rs = null;
        rs = svc.getAttachFile(3);
        assertEquals("어태치파일", rs.get(0).getFilename());
    }
    
    @Test
    public void test21_GetAttachFileList() throws Exception {
        List<ModelAttachFile> rs = null;
        rs = svc.getAttachFileList(1);
        assertEquals(7, rs.size());
    }
    
    @Test
    public void test22_InsertAttachFile() throws Exception {
        ModelAttachFile attachfile = new ModelAttachFile();
        attachfile.setFilename("aaa");
        attachfile.setArticleno(33);
        int rs = -1;
        rs = svc.insertAttachFile(attachfile);
        assertNotEquals(-1, rs);
        attachfile = new ModelAttachFile();
        attachfile.setFilename("bbb");
        attachfile.setArticleno(64);
        rs = -1;
        rs = svc.insertAttachFile(attachfile);
        assertNotEquals(-1, rs);
        attachfile = new ModelAttachFile();
        attachfile.setFilename("ccc");
        attachfile.setArticleno(54);
        attachfile.setUseYN(0);
        rs = -1;
        rs = svc.insertAttachFile(attachfile);
        assertNotEquals(-1, rs);
    }
    
    @Test
    public void test23_DeleteAttachFile() throws Exception {
        ModelAttachFile attachfile = new ModelAttachFile();
        attachfile.setFilename("aaa");
        int rs = -1;
        rs = svc.deleteAttachFile(attachfile);
        assertNotEquals(-1, rs);
        attachfile = new ModelAttachFile();
        attachfile.setAttachfileno(9);
        rs = -1;
        rs = svc.deleteAttachFile(attachfile);
        assertNotEquals(-1, rs);
        attachfile = new ModelAttachFile();
        attachfile.setUseYN(0);
        rs = -1;
        rs = svc.deleteAttachFile(attachfile);
        assertNotEquals(-1, rs);
    }
    
    @Test
    public void test24_GetComment() throws Exception {
        List<ModelComments> rs = null;
        rs = svc.getComment(1);
        assertEquals(1, rs.size());
        assertEquals("aa@aa.co.kr", rs.get(0).getEmail());
    }
    
    @Test
    public void test25_GetCommentList() throws Exception {
        List<ModelComments> rs = null;
        rs = svc.getCommentList(1);
        assertEquals(1, rs.size());
        assertEquals("aa@aa.co.kr", rs.get(0).getEmail());
    }
    
    @Test
    public void test26_InsertComment() throws Exception {
        int rs = -1;
        ModelComments comments = new ModelComments();
        comments.setEmail("aaaaa");
        comments.setArticleno(25);
        rs = svc.insertComment(comments);
        assertNotEquals(-1, rs);
        rs = -1;
        comments = new ModelComments();
        comments.setEmail("bbbb");
        comments.setArticleno(50);
        rs = svc.insertComment(comments);
        assertNotEquals(-1, rs);
        rs = -1;
        comments = new ModelComments();
        comments.setEmail("cccc");
        comments.setUseYN(0);
        comments.setArticleno(7);
        rs = svc.insertComment(comments);
        assertNotEquals(-1, rs);
        comments = new ModelComments();
        comments.setEmail("dddd");
        comments.setUseYN(0);
        comments.setArticleno(6);
        rs = svc.insertComment(comments);
        assertNotEquals(-1, rs);
    }
    
    @Test
    public void test27_UpdateComment() throws Exception {
        ModelComments searchValue = new ModelComments();
        searchValue.setCommentno(2);
        ModelComments updateValue = new ModelComments();
        updateValue.setMemo("memomo");        
        int rs = -1;
        rs = svc.updateComment(updateValue, searchValue);
        assertNotEquals(-1, rs);
        
        searchValue = new ModelComments();
        searchValue.setArticleno(50);
        updateValue = new ModelComments();
        updateValue.setMemo("artimeno");        
        rs = -1;
        rs = svc.updateComment(updateValue, searchValue);
        assertNotEquals(-1, rs);
        
        searchValue = new ModelComments();
        searchValue.setEmail("cccc");
        updateValue = new ModelComments();
        updateValue.setUseYN(0);
        
        rs = -1;
        rs = svc.updateComment(updateValue, searchValue);
        assertNotEquals(-1, rs);
    }
    
    @Test
    public void test28_DeleteComment() throws Exception {
        ModelComments comments = new ModelComments();
        int rs = -1;
        comments.setCommentno(2);
        rs = svc.deleteComment(comments);
        assertNotEquals(-1, rs);
        comments = new ModelComments();
        rs = -1;
        comments.setArticleno(50);
        rs = svc.deleteComment(comments);
        assertNotEquals(-1, rs);
        comments = new ModelComments();
        rs = -1;
        comments.setEmail("dddd");
        rs = svc.deleteComment(comments);
        assertNotEquals(-1, rs);
        comments = new ModelComments();
        rs = -1;
        comments.setUseYN(0);
        rs = svc.deleteComment(comments);
        assertNotEquals(-1, rs);
    }    
    
}
