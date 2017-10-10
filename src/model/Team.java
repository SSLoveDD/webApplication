/**
 * 
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="f_homework",name="fh_team")
public class Team {

	@Id
	@Column(name="team_id")
	private int team_id=0;
	@Column(name="team_name")
	private String team_name="";
	@Column(name="team_leader_id")
	private int team_leader_id=0;
	@Column(name="team_watchword")
	private String team_watchword="";
	@Column(name="team_department_id")
	private int team_department_id=0;
	@Column(name="team_score")
	private int team_score=0;
	@Column(name="team_group_id")
	private int team_group_id=0;
	

	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public int getTeam_leader_id() {
		return team_leader_id;
	}
	public void setTeam_leader_id(int team_leader_id) {
		this.team_leader_id = team_leader_id;
	}
	public String getTeam_watchword() {
		return team_watchword;
	}
	public void setTeam_watchword(String team_watchword) {
		this.team_watchword = team_watchword;
	}
	public int getTeam_department_id() {
		return team_department_id;
	}
	public void setTeam_department_id(int team_department_id) {
		this.team_department_id = team_department_id;
	}
	public int getTeam_score() {
		return team_score;
	}
	public void setTeam_score(int team_score) {
		this.team_score = team_score;
	}

	
}
