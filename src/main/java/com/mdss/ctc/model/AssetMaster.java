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
@Table(name = "asset_master")
public class AssetMaster
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rec_id")
	private int rec_id;
	
	@Column(name = "asset_no")
	private int asset_no;
	
	@Column(name = "serial_no")
	private String serial_no;

	@Column(name = "ref_no")
	private String ref_no;
	
	@Column(name = "item_id")
	private int item_id;
	
	@ManyToOne
	@JoinColumn(name = "item_id", insertable = false, updatable = false)
	private ItemMaster item;
	
	@Column(name = "purchase_date")
	private Date purchase_date;
	
	@Column(name = "vendor_id")
	private int vendor_id;
	
	@ManyToOne
	@JoinColumn(name = "vendor_id", insertable = false, updatable = false)
	private Vendor vendor;
	
	@Column(name = "warranty_period")
	private int warranty_period;
	
	@Column(name = "warranty_end_date")
	private Date warranty_end_date;
	
	@Column(name = "grn_location_id")
	private int grn_location_id;
	
	@ManyToOne
	@JoinColumn(name = "grn_location_id", insertable = false, updatable = false)
	private Location grn_location;
	
	@Column(name = "note")
	private String note;
	
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

	public int getRec_id() {
		return rec_id;
	}

	public void setRec_id(int rec_id) {
		this.rec_id = rec_id;
	}

	public int getAsset_no() {
		return asset_no;
	}

	public void setAsset_no(int asset_no) {
		this.asset_no = asset_no;
	}

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public String getRef_no() {
		return ref_no;
	}

	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public ItemMaster getItem() {
		return item;
	}

	public void setItem(ItemMaster item) {
		this.item = item;
	}

	public Date getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public int getWarranty_period() {
		return warranty_period;
	}

	public void setWarranty_period(int warranty_period) {
		this.warranty_period = warranty_period;
	}

	public Date getWarranty_end_date() {
		return warranty_end_date;
	}

	public void setWarranty_end_date(Date warranty_end_date) {
		this.warranty_end_date = warranty_end_date;
	}

	public int getGrn_location_id() {
		return grn_location_id;
	}

	public void setGrn_location_id(int grn_location_id) {
		this.grn_location_id = grn_location_id;
	}

	public Location getGrn_location() {
		return grn_location;
	}

	public void setGrn_location(Location grn_location) {
		this.grn_location = grn_location;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
