/**
 * 
 */
package showModel;

/**
 * @author kuang
 *
 */
public class ShowResult {

	private String team_name=null;
	private int team_score=0;
	public ShowResult(String team_name, int team_score) {
		super();
		this.team_name = team_name;
		this.team_score = team_score;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public int getTeam_score() {
		return team_score;
	}
	public void setTeam_score(int team_score) {
		this.team_score = team_score;
	}
	
}
