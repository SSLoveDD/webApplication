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
@Table(schema="f_homework",name="fh_user")
public class User {

	@Column(name="user_id")
	private int user_id=0;
	@Column(name="user_name")
	private String user_name="";
	@Column(name="user_psw")
	private String user_psw="";
	@Column(name="user_telephone")
	private String user_telephone="";
	@Column(name="user_game_name")
	private String user_game_name="";
	@Column(name="user_game_id")
	private int user_game_id=0;
	@Column(name="user_work_id")
	private int user_work_id=0;
	@Column(name="user_position")
	private String user_position="";
	@Column(name="user_team_id")
	private int user_team_id=0;
	
	@Id
	@Column(name="user_id")
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_psw() {
		return user_psw;
	}
	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}
	public String getUser_telephone() {
		return user_telephone;
	}
	public void setUser_telephone(String user_telephone) {
		this.user_telephone = user_telephone;
	}
	public String getUser_game_name() {
		return user_game_name;
	}
	public void setUser_game_name(String user_game_name) {
		this.user_game_name = user_game_name;
	}
	public int getUser_game_id() {
		return user_game_id;
	}
	public void setUser_game_id(int user_game_id) {
		this.user_game_id = user_game_id;
	}
	public int getUser_work_id() {
		return user_work_id;
	}
	public void setUser_work_id(int user_work_id) {
		this.user_work_id = user_work_id;
	}
	public String getUser_position() {
		return user_position;
	}
	public void setUser_position(String user_position) {
		this.user_position = user_position;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getUser_team_id() {
		return user_team_id;
	}
	public void setUser_team_id(int user_team_id) {
		this.user_team_id = user_team_id;
	}
	public User(String user_name, String user_psw) {
		super();
		this.user_name = user_name;
		this.user_psw = user_psw;
	}
	
	
}
