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
@Table(name = "item_master")
public class ItemMaster
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int item_id;
	
	@Column(name = "category_id")
	private int category_id;
	
	@ManyToOne
	@JoinColumn(name = "category_id", insertable = false, updatable = false)
	private ItemType catagory;
	
	@Column(name = "brand_id")
	private int brand_id;
	
	@ManyToOne
	@JoinColumn(name = "brand_id", insertable = false, updatable = false)
	private ItemBrand brand;
	
	@Column(name = "name_and_model")
	private String name_and_model;
	
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

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public ItemType getCatagory() {
		return catagory;
	}

	public void setCatagory(ItemType catagory) {
		this.catagory = catagory;
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public ItemBrand getBrand() {
		return brand;
	}

	public void setBrand(ItemBrand brand) {
		this.brand = brand;
	}

	public String getName_and_model() {
		return name_and_model;
	}

	public void setName_and_model(String name_and_model) {
		this.name_and_model = name_and_model;
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
