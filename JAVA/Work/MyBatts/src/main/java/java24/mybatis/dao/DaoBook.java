package java24.mybatis.dao;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.mybatis.inf.IBook;
import java24.mybatis.model.ModelBook;

@Repository("daobook")
public class DaoBook implements IBook {
    
    @Autowired //new를 대신해서 인스턴스 생성.
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public int getCount(ModelBook book) throws Exception {
        int result = -1;
        
        result = session.selectOne("mapper.mapperBook.getCount",book);
        return result;
    }

    @Override
    public int getMaxBookid() throws Exception {
        int result = -1;
        
        result = session.selectOne("mapper.mapperBook.getMaxBookid");
        return result;
    }

    @Override
    public List<ModelBook> selectAll(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        
        result = session.selectList("mapper.mapperBook.selectAll",book);
        return result;
    }

    @Override
    public List<ModelBook> selectLike(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        
        result = session.selectList("mapper.mapperBook.selectLike",book);
        return result;
    }

    @Override
    public List<ModelBook> selectEqual(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        
        result = session.selectList("mapper.mapperBook.selectEqual",book);
        return result;
    }

    @Override
    public int insertBook(ModelBook book) throws Exception {
        session.insert("mapper.mapperBook.insertBook",book);
        // auto_increment 컬럼의 경우 새로 생성된 값 return.
        return book.getBookid();
    }

    @Override
    public int insertMap(String bookname, Date dtm, int authid) throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("b1", bookname);
        map.put("d1",      dtm);
        map.put("a1",   authid);
        
        result = session.insert("mapper.mapperBook.insertMap",map);
        return result;
    }

    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook) throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("wherebook", wherebook);
        map.put("setbook",   setbook);
        
        result = session.update("mapper.mapperBook.updateBook",map);
        return result;
    }

    @Override
    public int deleteBook(ModelBook book) throws Exception {
        int result = -1;
        
        result = session.delete("mapper.mapperBook.deleteBook",book);
        return result;
    }

    @Override
    public List<ModelBook> selectDynamic(ModelBook book) throws Exception {
        return null;
    }
    
}
