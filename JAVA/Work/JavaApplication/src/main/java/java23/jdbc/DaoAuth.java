package java23.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAuth implements IAuth {
    private java.sql.Connection conn  = null;
    
    // 생성자
    public DaoAuth(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public int getCount(ModelAuth auth) throws SQLException {

        int result = -1;
        try {
            // SQL 문장
            String query = " select count(*) as total from auth ";
            
            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement( query );
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            ResultSet rs = stmt.executeQuery();
            
            // 값을 빼내기
            rs.next(); // 커서 이동.
            result = rs.getInt( "total" );
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        
        int result = -1;
        try {
            // SQL 문장
            String query = " select max(authid) authid from auth  ";

            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement( query ); 
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            ResultSet rs =stmt.executeQuery();
            
            // 커서를 첫번째 row 이동.
            rs.first();
            result = rs.getInt("authid");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertBook(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateBook(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteBook(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
