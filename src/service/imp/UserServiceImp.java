/**
 * 
 */
package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import model.User;
import persist.UserManager;
import service.UserService;

/**
 * @author kuang
 *
 */
@Service("UserService")
public class UserServiceImp implements UserService {


	@Autowired
	private UserManager um=null;
	
	/* (non-Javadoc)
	 * @see service.UserService#queryUser(java.lang.String)
	 */
	@Override
	public User queryUserByName(String name) {
		// TODO Auto-generated method stub
		return um.queryUser(name);
	}

	/* (non-Javadoc)
	 * @see service.UserService#getUsers()
	 */
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see service.UserService#addUser(model.User)
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

		um.addUser(user);
	}

	/* (non-Javadoc)
	 * @see service.UserService#updateUser(int)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

		um.updateUser(user);
	}

	/* (non-Javadoc)
	 * @see service.UserService#getUserInfo(java.lang.String)
	 */
	@Override
	public Object getUserInfo(String name) {
		// TODO Auto-generated method stub
		return um.getUserInfo(name);
	}

	/* (non-Javadoc)
	 * @see service.UserService#updateUser(com.alibaba.fastjson.JSONObject)
	 */
	@Override
	public void updateUser(JSONObject json) {
		// TODO Auto-generated method stub
		um.updateUser(json);
	}

	/* (non-Javadoc)
	 * @see service.UserService#updateUserByPart(com.alibaba.fastjson.JSONObject)
	 */
	@Override
	public void updateUserByPart(JSONObject json) {
		// TODO Auto-generated method stub
		um.updateUserByPart(json);
	}

	/* (non-Javadoc)
	 * @see service.UserService#searchUserFuzy(com.alibaba.fastjson.JSONObject)
	 */
	@Override
	public List<User> searchUserFuzy(JSONObject json) {
		// TODO Auto-generated method stub
		return um.searchUserFuzy(json);
	}

	/* (non-Javadoc)
	 * @see service.UserService#save(model.User)
	 */
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		um.save(user);
	}

}
