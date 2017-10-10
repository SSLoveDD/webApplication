/**
 * 
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kuang
 *
 */
@Entity
@Table(schema="f_homework",name="fh_match")
public class Match {
	
	@Id
	@Column(name="match_id")
	private int match_id=0;
	@Column(name="match_teamA_id")
	private int match_teamA_id=0;
	@Column(name="match_teamB_id")
	private int match_teamB_id=0;
	@Column(name="match_result")
	private int match_result=0;
	@Column(name="match_datetime")
	private int match_datetime=0;
	@Column(name="match_group_id")
	private int match_group_id=0;
	
	public int getMatch_group_id() {
		return match_group_id;
	}
	public void setMatch_group_id(int match_group_id) {
		this.match_group_id = match_group_id;
	}
	public int getMatch_id() {
		return match_id;
	}
	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}
	public int getMatch_teamA_id() {
		return match_teamA_id;
	}
	public void setMatch_teamA_id(int match_teamA_id) {
		this.match_teamA_id = match_teamA_id;
	}
	public int getMatch_teamB_id() {
		return match_teamB_id;
	}
	public void setMatch_teamB_id(int match_teamB_id) {
		this.match_teamB_id = match_teamB_id;
	}
	public int getMatch_result() {
		return match_result;
	}
	public void setMatch_result(int match_result) {
		this.match_result = match_result;
	}
	public int getMatch_datetime() {
		return match_datetime;
	}
	public void setMatch_datetime(int match_datetime) {
		this.match_datetime = match_datetime;
	}

	
}
