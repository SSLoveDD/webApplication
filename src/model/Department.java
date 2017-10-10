package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="f_homework",name="fh_department")
public class Department {

	@Id
	@Column(name="department_id")
	private int department_id=0;
	@Column(name="department_name")
	private String department_name=null;
	@Column(name="department_tel")
	private int department_tel=0;
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getDepartment_tel() {
		return department_tel;
	}
	public void setDepartment_tel(int department_tel) {
		this.department_tel = department_tel;
	}
	
	
}
