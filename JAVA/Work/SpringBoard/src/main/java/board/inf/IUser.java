package board.inf;

import java.util.List;

import board.model.ModelUser;

public interface IUser {
    
    int getCount(ModelUser user) throws Exception;

    int getMaxUserid() throws Exception;

    List<ModelUser> selectAll() throws Exception;

    List<ModelUser> selectLike(ModelUser user) throws Exception;

    List<ModelUser> selectEqual(ModelUser user) throws Exception;

    int insertUser(ModelUser user) throws Exception;

    int updateUser(ModelUser whereuser, ModelUser setuser) throws Exception;

    int deleteUser(ModelUser user) throws Exception;
}