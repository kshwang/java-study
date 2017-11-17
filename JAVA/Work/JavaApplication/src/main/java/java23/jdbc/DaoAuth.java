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
            String query = " select count(*) as cnt from auth ";
            
            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            ResultSet rs = stmt.executeQuery();
            
            // 값을 가져오기
            rs.next(); // 다음 row 커서 이동.
            result = rs.getInt("cnt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        int result = -1;

        try {
            // SQL 문장
            String query = " select max(authid) authid from auth ";

            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query); 
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            ResultSet rs = stmt.executeQuery();
            
            rs.first(); // 첫번째 row 커서 이동.
            result = rs.getInt("authid");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        java.sql.ResultSet rs = null;

        try {
            // SQL 문장
            String query = " select * from auth ";

            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query); 
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            rs = stmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        java.sql.ResultSet rs = null;

        try {
            // SQL 문장
            String query = " select * from auth where name like ? ";

            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query); 
            stmt.setString(1,"%"+auth.getName()+"%");
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            rs = stmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        java.sql.ResultSet rs = null;

        try {
            // SQL 문장
            String query = " select * from auth where name = ? ";

            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query); 
            stmt.setString(1,auth.getName());
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            rs = stmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int insertBook(ModelAuth auth) throws SQLException {
        int rs = -1;

        try {
            // SQL 문장
            String query = " insert into auth \n "+ 
                           "     values(?, ?, ?) ";

            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query); 
            stmt.setInt(1,auth.getAuthid());
            stmt.setString(2,auth.getName());
            stmt.setString(3,auth.getBirth());
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int updateBook(ModelAuth whereauth, ModelAuth setauth) throws SQLException {
        int rs = -1;

        try {
            // SQL 문장
            String query = " update auth \n"+ 
                           "    set name = ?, birth = ? \n"+
                           "  where 1 = 1  \n"+
                           "    and authid = ? ";

            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query); 
            stmt.setString(1,setauth.getName());
            stmt.setString(2,setauth.getBirth());
            stmt.setInt(3,whereauth.getAuthid());
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int deleteBook(ModelAuth auth) throws SQLException {
        int rs = -1;

        try {
            // SQL 문장
            String query = " delete from auth \n"+ 
                           "  where 1 = 1 \n"+
                           "    and authid  = ? \n"+
                           "    and name = ? ";

            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query); 
            stmt.setInt(1,auth.getAuthid());
            stmt.setString(2,auth.getName());
            
            // 문장 객체 실행 : executeQuery() or executeUpdate() 
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        java.sql.ResultSet result = null;

        try {
            // query 작성
            String query = " select * from auth \n"+
                           "  where 1 = 1 \n";
            
            if (auth.getAuthid() != null)  query += " and authid = ? \n";
            if (!auth.getName().isEmpty()) query += " and name = ? ";
            
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            int c = 1;
            if(auth.getAuthid() != null) stmt.setInt(c++, auth.getAuthid());
            if(!auth.getName().isEmpty()) stmt.setString(c++, auth.getName());
            
            // query 실행
            result = stmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
}
