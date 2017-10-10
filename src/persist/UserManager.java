/**
 * 
 */
package persist;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import model.User;

/**
 * @author kuang
 *
 */
public interface UserManager {

	User queryUser(String name);

	List<User> getUsers();

	void addUser(User user);

	void updateUser(int userID);
    
	Object getUserInfo(String name);
	
	void updateUser(JSONObject json);
	
	void updateUser(User user);
	
	User queryUser(int user_id);
	
	void updateUserByPart(JSONObject json);
	
	List<User> searchUserFuzy(JSONObject json);
	
	void save(User user);
}
