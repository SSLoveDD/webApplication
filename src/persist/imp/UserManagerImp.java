/**
 * 
 */
package persist.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSONObject;

import model.User;
import persist.BaseManager;
import persist.UserManager;

/**
 * @author kuang
 *
 */
@Repository("UserManager")
public class UserManagerImp extends BaseManager implements UserManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#queryUser(java.lang.String)
	 */
	@Override
	public User queryUser(String name) {
		// TODO Auto-generated method stub
		Object o = super.getSession().createCriteria(User.class).add(Restrictions.eq("user_name", name)).uniqueResult();
		if (o == null) {
			return null;
		}
		return (User) o;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#getUsers()
	 */
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#addUser(model.User)
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

		super.saveObject(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#updateUser(int)
	 */
	@Override
	public void updateUser(int userID) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#getUserInfo(java.lang.String)
	 */
	@Override
	public Object getUserInfo(String name) {
		// TODO Auto-generated method stub
		String HQL = "SELECT user.user_id,user.user_name AS user_name,user.user_game_name AS user_game_name,"
				+ "user.user_game_id AS user_game_id,user.user_telephone AS user_telephone,"
				+ "user.user_work_id AS user_work_id,user.user_position AS user_position,"
				+ "team.team_name AS team_name FROM User user,Team team WHERE user.user_name='" + name
				+ "' AND user.user_team_id=team.team_id";
		Object result = super.currentSession().createQuery(HQL).uniqueResult();
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#updateUser(com.alibaba.fastjson.JSONObject)
	 */
	@Override
	public void updateUser(JSONObject json) {
		// TODO Auto-generated method stub
		// Session session=super.getSession();
		// int id=(int) session.createQuery("SELECT user.user_id FROM User user
		// where user.name='"+
		// json.getString("user_name")+"'").uniqueResult();
		//// String HQL="WHERE ";
		// for(Object o:json.values()){
		//
		// }
		// Query q=super.currentSession().createQuery();
		//
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#updateUser(model.User)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		super.updateObject(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#queryUser(int)
	 */
	@Override
	public User queryUser(int user_id) {
		// TODO Auto-generated method stub
		Object o = super.getSession().createCriteria(User.class).add(Restrictions.eq("user_id", user_id))
				.uniqueResult();
		if (o == null) {
			return null;
		}
		return (User) o;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * persist.UserManager#updateUserByPart(com.alibaba.fastjson.JSONObject)
	 */
	@Override
	public void updateUserByPart(JSONObject json) {
		// TODO Auto-generated method stub
		User user = queryUser(json.getString("user_name"));

		for (String s : json.keySet()) {
			if (s != null && json.getString(s) == null) {
				continue;
			} else {
				if (s.equals("user_name")) {
					user.setUser_name(json.getString(s));
				} else if (s.equals("user_game_name")) {
					user.setUser_game_name(json.getString(s));
				} else if (s.equals("user_game_id")) {
					user.setUser_game_id(json.getIntValue(s));
				} else if (s.equals("user_position")) {
					user.setUser_position(json.getString(s));
				} else if(s.equals("user_telephone")){
					user.setUser_telephone(json.getString(s));
				}
			}
		}
		super.saveObject(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see persist.UserManager#searchUserFuzy(com.alibaba.fastjson.JSONObject)
	 */
	@Override
	public List<User> searchUserFuzy(JSONObject json) {
		// TODO Auto-generated method stub
		String name = json.getString("user_name");
		String tel = json.getString("user_telephone");
		String HQL = "FROM User user WHERE user.user_name like :name AND user.user_telephone like :tel";
		return super.currentSession().createQuery(HQL).list();
	}

	/* (non-Javadoc)
	 * @see persist.UserManager#save(model.User)
	 */
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		super.saveObject(user);
	}

}
