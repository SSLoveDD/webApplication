package service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import model.User;

public interface UserService {

   User queryUserByName(String name);
   List<User> getUsers();
   void addUser(User user);
   void updateUser(User user);
   Object getUserInfo(String name);
   void updateUser(JSONObject json);
   void updateUserByPart(JSONObject json);
   List<User> searchUserFuzy(JSONObject json);
   void save(User user);
}
