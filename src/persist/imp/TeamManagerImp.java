/**
 * 
 */
package persist.imp;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Team;
import model.User;
import persist.BaseManager;
import persist.TeamManager;
import persist.UserManager;

/**
 * @author kuang
 *
 */
@Repository("TeamManger")
public class TeamManagerImp extends BaseManager implements TeamManager {

	/* (non-Javadoc)
	 * @see persist.TeamManager#getTeamInfo(java.lang.String)
	 */
	@Autowired
	private UserManager um=null;
	
	@Override
	public Object getTeamInfo(String name) {
		// TODO Auto-generated method stub
		Team team=getTeamByUserName(name);
		String HQL="SELECT team.team_id,team.team_name,user.user_name,team.team_watchword,fh_group.group_name "
				+ "FROM Team team,User user,Group fh_group WHERE "
				+ "team.team_id='"+team.getTeam_id()+"' AND team.team_group_id=fh_group.group_id "
						+ "AND team.team_leader_id=user.user_id";
		Object o=super.currentSession().createQuery(HQL).uniqueResult();
		return o;
	}

	public Team getTeamByUserName(String username){
		User user=um.queryUser(username);
		Team team=getTeamByID(user.getUser_team_id());
		return team;
	}

	/**
	 * @param user_team_id
	 * @return
	 */
	public Team getTeamByID(int team_id) {
		// TODO Auto-generated method stub
		Object o= super.getSession().createCriteria(Team.class).add(Restrictions.eq("team_id", team_id)).uniqueResult();
		return (Team)o;
	}

	/* (non-Javadoc)
	 * @see persist.TeamManager#getTeamMembers(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getTeamMembers(String user_name) {
		// TODO Auto-generated method stub
		Team team=getTeamByUserName(user_name);
		String HQL="FROM User user WHERE user.user_team_id='"+team.getTeam_id()+"'";
		return super.currentSession().createQuery(HQL).list();
	}

	/* (non-Javadoc)
	 * @see persist.TeamManager#deletMemberByID(int)
	 */
	@Override
	public void deletMemberByID(int user_id) {
		// TODO Auto-generated method stub
		User user=um.queryUser(user_id);
		user.setUser_team_id(0);
		um.updateUser(user);
	}
}
