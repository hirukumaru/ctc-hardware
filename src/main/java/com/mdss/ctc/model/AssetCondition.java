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
@Table(name = "asset_condition")
public class AssetCondition
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "condition_id")
	private int condition_id;
	
	@Column(name = "condition_name")
	private String condition_name;
	
	@Column(name = "created_date")
	private Date created_date;
	
	@Column(name = "created_user_id")
	private int created_user_id;
	
	@ManyToOne
	@JoinColumn(name = "created_user_id", insertable = false, updatable = false)
	private Login created_by;
	
	@Column(name = "is_active")
	private boolean is_active;

	public int getCondition_id() {
		return condition_id;
	}

	public void setCondition_id(int condition_id) {
		this.condition_id = condition_id;
	}

	public String getCondition_name() {
		return condition_name;
	}

	public void setCondition_name(String condition_name) {
		this.condition_name = condition_name;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getCreated_user_id() {
		return created_user_id;
	}

	public void setCreated_user_id(int created_user_id) {
		this.created_user_id = created_user_id;
	}

	public Login getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Login created_by) {
		this.created_by = created_by;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
}
