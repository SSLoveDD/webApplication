/**
 * 
 */
package persist;

import java.util.List;

import model.Match;
import showModel.ShowMatch;
import showModel.ShowResult;
/**
 * @author kuang
 *
 */
public interface MatchManager {

	
	List<Match> getAllMatchs();
	List<Match> getMatchsByGroup(int GroupID);
	Match getMatchByID(int matchID);
	void updateMatchByID(int matchID);
	void deleleMatchByID(int matchID);
	List<Match> getMatchsByGroup(String GroupName);
	Match getMatchByID(String matchName);
	void updateMatchByID(String matchname);
	void deleleMatchByID(String matchname);
	List<ShowMatch> getAllShowMatchs();
	List<ShowResult> getShowMatchsByGroup(String GroupName);
}
