package java26.springboard.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

import java26.springboard.inf.*;
import java26.springboard.model.*;

@Service("serviceuser")
public class ServiceUser implements IServiceUser {
    
    // SLF4J Logging
    private static Logger logger = LoggerFactory.getLogger(ServiceUser.class);

    @Autowired
    @Qualifier("daouser")
    private IUser daouser;

    public ServiceUser() {
        super();
    }

    @Override
    public int insertUser(ModelUser user) {
        
        int result = -1;
        try {
            result = daouser.insertUser(user);
            //session.commit();
        } catch (Exception e) {
            logger.error("insertUser " + e.getMessage() );
        }
		
        return result;
    }

    @Override
    public ModelUser login(ModelUser user) {
        
        ModelUser result = null;
		
        try {
            result = daouser.login(user);
        } catch (Exception e) {
            logger.error("login " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int logout(String userid) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateUserInfo(ModelUser setValue, ModelUser whereValue) {
        int result = -1;
        try {
            result = daouser.updateUserInfo(setValue, whereValue);
        } catch (Exception e) {
            logger.error("updateUserInfo" + e.getMessage() );
        }
        return result;
    }

    @Override
    public int updatePasswd(ModelUser user) {
        int result = -1;
        try {
            result = daouser.updatePasswd(user);
        } catch (Exception e) {
            logger.error("updateUserInfo" + e.getMessage() );
        }
        return result;
    }

    @Override
    public int deleteUser(ModelUser whereValue) {
        int result = -1;
        try {
            result = daouser.deleteUser(whereValue);
        } catch (Exception e) {
            logger.error("updateUserInfo " + e.getMessage() );
        }
        return result;
    }

    @Override
    public ModelUser selectUserOne(ModelUser user) {
        ModelUser result = null;
        try {
            result = daouser.selectUserOne(user);
        } catch (Exception e) {
            logger.error("selectUserOne " + e.getMessage() );
        }
        return result;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) {
        List<ModelUser> result = null;
        try {
            result = daouser.selectUserList(user);
        } catch (Exception e) {
            logger.error("selectUserList " + e.getMessage() );
        }
        return result;
    }
}
