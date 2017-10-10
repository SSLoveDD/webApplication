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
@Table(schema="f_homework",name="fh_admin")
public class Admin {

	@Id
	@Column(name="admin_id")
	private int admin_id=0;
	@Column(name="admin_name")
	private String admin_name="";
	@Column(name="admin_psw")
	private String admin_psw="";
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_psw() {
		return admin_psw;
	}
	public void setAdmin_psw(String admin_psw) {
		this.admin_psw = admin_psw;
	}

}
