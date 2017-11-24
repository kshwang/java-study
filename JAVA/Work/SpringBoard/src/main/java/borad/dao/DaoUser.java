package borad.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IUser;
import board.model.ModelUser;

@Repository("daouser")
public class DaoUser implements IUser {

    @Autowired //new를 대신해서 인스턴스 생성.
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public int getCount(ModelUser user) throws Exception {
        int result = -1;
        
        result = session.selectOne("mapper.mapperUser.getCount",user);
        return result;
    }

    @Override
    public int getMaxUserid() throws Exception {
        int result = -1;
        
        result = session.selectOne("mapper.mapperUser.getMaxUserid");
        return result;
    }

    @Override
    public List<ModelUser> selectAll() throws Exception {
        List<ModelUser> result = null;
        
        result = session.selectList("mapper.mapperUser.selectAll");
        return result;
    }

    @Override
    public List<ModelUser> selectLike(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        
        result = session.selectList("mapper.mapperUser.selectLike",user);
        return result;
    }

    @Override
    public List<ModelUser> selectEqual(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        
        result = session.selectList("mapper.mapperUser.selectEqual",user);
        return result;
    }

    @Override
    public int insertUser(ModelUser user) throws Exception {
        int result = -1;
        
        result = session.insert("mapper.mapperUser.insertUser",user);
        return result;
    }

    @Override
    public int updateUser(ModelUser whereuser, ModelUser setuser) throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("whereuser", whereuser);
        map.put("setuser",   setuser);
        
        result = session.update("mapper.mapperUser.updateUser",map);
        return result;
    }

    @Override
    public int deleteUser(ModelUser user) throws Exception {
        int result = -1;
        
        result = session.delete("mapper.mapperUser.deleteUser",user);
        return result;
    }
    
}
