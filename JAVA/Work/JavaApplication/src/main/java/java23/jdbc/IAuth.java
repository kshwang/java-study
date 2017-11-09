package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IAuth {
    int getCount(ModelAuth auth) throws SQLException;
    
    int getMaxAuthid() throws SQLException;
    
    ResultSet selectAll() throws SQLException;
    
    ResultSet selectLike(ModelAuth auth) throws SQLException;
    
    ResultSet selectEqual(ModelAuth auth) throws SQLException;
    
    ResultSet selectDynamic(ModelAuth auth) throws SQLException;
    
    int insertBook(ModelAuth auth) throws SQLException;
    
    int updateBook(ModelAuth whereauth, ModelAuth setauth) throws SQLException;
    
    int deleteBook(ModelAuth auth) throws SQLException;
}