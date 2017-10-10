/**
 * 
 */
package service;
import java.util.List;

import model.User;
/**
 * @author kuang
 *
 */
public interface TeamService {

	Object getTeamInfo(String name);
	List<User> getTeamMembers(String user_name);
	void deleteMemberByID(int user_id);
}
