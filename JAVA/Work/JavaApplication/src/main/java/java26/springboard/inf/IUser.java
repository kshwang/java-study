package java26.springboard.inf;

import java.util.List;

import java26.springboard.model.ModelUser;

public interface IUser {

   int insertUser(ModelUser user);
   
   ModelUser login(ModelUser user );
   
   int logout(String userid);
   
   int updateUserInfo(ModelUser setValue, ModelUser whereValue);
   
   int updatePasswd(ModelUser user);
   
   int deleteUser(ModelUser user);
   
   ModelUser selectUserOne(ModelUser user);
   
   List<ModelUser> selectUserList(ModelUser user);
}
