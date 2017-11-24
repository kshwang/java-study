package board.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.inf.IServiceUser;
import board.inf.IUser;
import board.model.ModelUser;

@Service("serviceuser")
public class ServiceUser implements IServiceUser {

    @Autowired //new를 대신해서 인스턴스 생성.
    @Qualifier("daouser")
    private IUser dao;

    @Override
    public int getCount(ModelUser user) throws Exception {
        int result = -1;
        try {
            result = dao.getCount(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int getMaxUserid() throws Exception {
        int result = -1;
        try {
            result = dao.getMaxUserid();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelUser> selectAll() throws Exception {
        List<ModelUser> result = null;
        try {
        result = dao.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelUser> selectLike(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        try {
        result = dao.selectLike(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelUser> selectEqual(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        try {
        result = dao.selectEqual(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertUser(ModelUser user) throws Exception {
        int result = -1;
        try {
        result = dao.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateUser(ModelUser whereuser, ModelUser setuser) throws Exception {
        int result = -1;
        try {
        result = dao.updateUser(whereuser, setuser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteUser(ModelUser user) throws Exception {
        int result = -1;
        try {
        result = dao.deleteUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
