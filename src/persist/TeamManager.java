/**
 * 
 */
package persist;
import java.util.List;

import model.*;
/**
 * @author kuang
 *
 */
public interface TeamManager{
	Object getTeamInfo(String name);
	List<User> getTeamMembers(String user_name);
	void deletMemberByID(int user_id);
}
