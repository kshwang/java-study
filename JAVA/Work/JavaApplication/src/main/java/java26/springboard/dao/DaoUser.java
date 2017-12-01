package java26.springboard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

import java.util.*;

import java26.springboard.inf.*;
import java26.springboard.model.*;

@Repository("daouser")
public class DaoUser implements IUser {

    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;    
    
    @Override
    public int insertUser(ModelUser user) {
        return session.insert("mapper.mapperUser.insertUser", user);   
    }

    @Override
    public ModelUser login(ModelUser user) {
        return session.selectOne("mapper.mapperUser.login", user);
    }

    @Override
    public int logout(String userid) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateUserInfo(ModelUser setValue, ModelUser whereValue) {
        
        Map<String, ModelUser> parameter = new HashMap<String, ModelUser>(); 
        parameter.put("setValue"  ,      setValue);
        parameter.put("whereValue",      whereValue);

        return session.update("mapper.mapperUser.updateUserInfo", parameter);
    }

    @Override
    public int updatePasswd(ModelUser user) {
        return session.update("mapper.mapperUser.updatePasswd", user);
    }

    @Override
    public int deleteUser(ModelUser user) {
        return session.delete("mapper.mapperUser.deleteUser", user);
    }

    @Override
    public ModelUser selectUserOne(ModelUser user) {
        return session.selectOne("mapper.mapperUser.selectUserOne", user);
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) {
        return session.selectList("mapper.mapperUser.selectUserList", user);
    }
    
}
