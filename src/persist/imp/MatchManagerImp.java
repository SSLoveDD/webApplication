/**
 * 
 */
package persist.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import model.Match;
import model.User;
import persist.BaseManager;
import persist.MatchManager;
import showModel.ShowMatch;
import showModel.ShowResult;

/**
 * @author kuang
 *
 */
@Repository("MatchManager")
public class MatchManagerImp extends BaseManager implements MatchManager {

	/* (non-Javadoc)
	 * @see persist.MatchManager#getAllMatchs()
	 */
	@Override
	public List<Match> getAllMatchs() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#getMatchsByGroup()
	 */
	@Override
	public List<Match> getMatchsByGroup(int groupid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#getMatchByID()
	 */
	@Override
	public Match getMatchByID(int matchID) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#updateMatchByID()
	 */
	@Override
	public void updateMatchByID(int matchID) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#deleleMatchByID()
	 */
	@Override
	public void deleleMatchByID(int matchID) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#getMatchsByGroup(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Match> getMatchsByGroup(String GroupName) {
		// TODO Auto-generated method stub
		return  super.getSession().createCriteria(Match.class).add(Restrictions.eq("user_name", GroupName)).list();
	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#getMatchByID(java.lang.String)
	 */
	@Override
	public Match getMatchByID(String matchName) {
		// TODO Auto-generated method stub
		
		return null;
	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#updateMatchByID(java.lang.String)
	 */
	@Override
	public void updateMatchByID(String matchname) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#deleleMatchByID(java.lang.String)
	 */
	@Override
	public void deleleMatchByID(String matchname) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#getAllShowMatchs()
	 */
	@Override
	public List<ShowMatch> getAllShowMatchs() {
		// TODO Auto-generated method stub
		
		return null;
	}

	/* (non-Javadoc)
	 * @see persist.MatchManager#getShowMatchsByGroup(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ShowResult> getShowMatchsByGroup(String groupName) {
		// TODO Auto-generated method stub
//		String HQL="SELECT new showModel.ShowMatch(teamA.team_name,teamB.team_name,fh_match.match_result,fh_match.match_datetime) "
//				+ "FROM Match fh_match,Team teamA,Team teamB,Group fh_group "
//				+ "WHERE fh_match.match_teamA_id=teamA.team_id "
//				+ "AND fh_match.match_teamB_id=teamB.team_id "
//				+ "AND fh_match.match_group_id=fh_group.group_id "
//				+ "AND fh_group.group_name='"+groupName+"'";
//		String test=HQL.substring(166);
		String HQL="SELECT new showModel.ShowResult(fh_team.team_name,fh_team.team_score) "
				+ "FROM Team fh_team,Group fh_group WHERE fh_group.group_name='"+groupName+"' "
						+ "ORDER BY fh_team.team_score";
		Query query=super.getSession().createQuery(HQL);
		return query.list();
	}

}
