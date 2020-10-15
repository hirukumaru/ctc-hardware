package com.mdss.ctc.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	private int location_id;
	
	@Column(name = "location_name")
	private String location_name;
	
	@Column(name = "main_location_id")
	private int main_location_id;
	
	@Column(name = "created_date")
	private Date created_date;
	
	@ManyToOne
	@JoinColumn(name = "created_user_id", insertable = false, updatable = false)
	private Login created_by;
	
	@Column(name = "last_modified_date")
	private Date last_modified_date;
	
	@Column(name = "last_modified_user_id")
	private int last_modified_user_id;
	
	@ManyToOne
	@JoinColumn(name = "last_modified_user_id", insertable = false, updatable = false)
	private Login modified_by;
	
	@Column(name = "is_active")
	private boolean is_active;
	
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Date last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	public int getLast_modified_user_id() {
		return last_modified_user_id;
	}
	public void setLast_modified_user_id(int last_modified_user_id) {
		this.last_modified_user_id = last_modified_user_id;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public Login getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Login created_by) {
		this.created_by = created_by;
	}
	public Login getModified_by() {
		return modified_by;
	}
	public void setModified_by(Login modified_by) {
		this.modified_by = modified_by;
	}
	public int getMain_location_id() {
		return main_location_id;
	}
	public void setMain_location_id(int main_location_id) {
		this.main_location_id = main_location_id;
	}
}
