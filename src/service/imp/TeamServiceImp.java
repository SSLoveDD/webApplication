/**
 * 
 */
package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.User;
import persist.TeamManager;
import service.TeamService;

/**
 * @author kuang
 *
 */
@Service("TeamService")
public class TeamServiceImp implements TeamService {

	/* (non-Javadoc)
	 * @see service.TeamService#getTeamInfo(java.lang.String)
	 */
	@Autowired
	private TeamManager tmm=null;
	
	@Override
	public Object getTeamInfo(String name) {
		// TODO Auto-generated method stub
		return tmm.getTeamInfo(name);
	}

	/* (non-Javadoc)
	 * @see service.TeamService#getTeamMembers(java.lang.String)
	 */
	@Override
	public List<User> getTeamMembers(String user_name) {
		// TODO Auto-generated method stub
		return tmm.getTeamMembers(user_name);
	}

	/* (non-Javadoc)
	 * @see service.TeamService#deleteMemberByID(int)
	 */
	@Override
	public void deleteMemberByID(int user_id) {
		// TODO Auto-generated method stub
		tmm.deletMemberByID(user_id);
	}

}
