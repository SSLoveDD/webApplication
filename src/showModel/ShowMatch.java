package showModel;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import persist.MatchManager;
import service.UserService;

/**
 * @author kuang
 *
 */
@Entity
public class ShowMatch {

  private String teamA=null;
  private String teamB=null;
  private int result;
  private int timeStamp=0;
  
  public ShowMatch() {
	// TODO Auto-generated constructor stub
	  
}

public ShowMatch(String teamA, String teamB, int result,int timeStamp) {
	super();
	this.teamA = teamA;
	this.teamB = teamB;
	this.timeStamp = timeStamp;
}

public String getTeamA() {
	return teamA;
}

public void setTeamA(String teamA) {
	this.teamA = teamA;
}

public String getTeamB() {
	return teamB;
}

public void setTeamB(String teamB) {
	this.teamB = teamB;
}

public int getResult() {
	return result;
}

public void setResult(int result) {
	this.result = result;
}

public int getTimeStamp() {
	return timeStamp;
}

public void setTimeStamp(int timeStamp) {
	this.timeStamp = timeStamp;
}
  
  
}
