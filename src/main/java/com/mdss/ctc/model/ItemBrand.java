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
@Table(name = "brand")
public class ItemBrand
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brand_id")
	private int brand_id;
	
	@Column(name = "brand_name")
	private String brand_name;
	
	@Column(name = "created_date")
	private Date created_date;
	
	@Column(name = "created_user_id")
	private int created_user_id;
	
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

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
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

	public Login getModified_by() {
		return modified_by;
	}

	public void setModified_by(Login modified_by) {
		this.modified_by = modified_by;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
}
