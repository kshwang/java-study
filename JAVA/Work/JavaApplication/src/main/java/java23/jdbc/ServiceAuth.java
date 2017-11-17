package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAuth implements IAuth {
    private java.sql.Connection conn  = null;
    
    public ServiceAuth() {
        super();
        this.conn = DBConnect.makeConnection();
    }

    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        int rs = -1;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.getCount(auth);
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        int rs = -1;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.getMaxAuthid();
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        ResultSet rs = null;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectAll();
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectLike(auth);
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectEqual(auth);
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int insertBook(ModelAuth auth) throws SQLException {
        int rs = -1;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.insertBook(auth);
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int updateBook(ModelAuth whereauth, ModelAuth setauth) throws SQLException {
        int rs = -1;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.updateBook(whereauth, setauth);
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int deleteBook(ModelAuth auth) throws SQLException {
        int rs = -1;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.deleteBook(auth);
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        
        try {
            // transaction 시작
            this.conn.setAutoCommit(false);
            
            // DAO의 SQL문 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectDynamic(auth);
            
            // transaction 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            e.printStackTrace();
            // transaction 롤백
            this.conn.rollback();
        }
        
        return rs;
    }
    
}
