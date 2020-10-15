package com.mdss.ctc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_menu_access")
public class LoginMenuAccess
{
	@Id
	@GeneratedValue
	@Column(name = "log_id")
	private int log_id;
	
	@Column(name = "menu_item_1")
	private int menu_item_1;
	
	@Column(name = "menu_item_2")
	private int menu_item_2;
	
	@Column(name = "menu_item_3")
	private int menu_item_3;
	
	@Column(name = "menu_item_4")
	private int menu_item_4;
	
	@Column(name = "menu_item_5")
	private int menu_item_5;
	
	@Column(name = "menu_item_6")
	private int menu_item_6;
	
	@Column(name = "menu_item_7")
	private int menu_item_7;
	
	@Column(name = "menu_item_8")
	private int menu_item_8;
	
	@Column(name = "menu_item_9")
	private int menu_item_9;
	
	@Column(name = "menu_item_10")
	private int menu_item_10;
	
	@Column(name = "last_modified_date")
	private Date last_modified_date;
	
	@Column(name = "last_modified_user_id")
	private int last_modified_user_id;

	public int getLogin_id() {
		return log_id;
	}

	public void setLogin_id(int login_id) {
		this.log_id = login_id;
	}

	public int getMenu_item_1() {
		return menu_item_1;
	}

	public void setMenu_item_1(int menu_item_1) {
		this.menu_item_1 = menu_item_1;
	}

	public int getMenu_item_2() {
		return menu_item_2;
	}

	public void setMenu_item_2(int menu_item_2) {
		this.menu_item_2 = menu_item_2;
	}

	public int getMenu_item_3() {
		return menu_item_3;
	}

	public void setMenu_item_3(int menu_item_3) {
		this.menu_item_3 = menu_item_3;
	}

	public int getMenu_item_4() {
		return menu_item_4;
	}

	public void setMenu_item_4(int menu_item_4) {
		this.menu_item_4 = menu_item_4;
	}

	public int getMenu_item_5() {
		return menu_item_5;
	}

	public void setMenu_item_5(int menu_item_5) {
		this.menu_item_5 = menu_item_5;
	}

	public int getMenu_item_6() {
		return menu_item_6;
	}

	public void setMenu_item_6(int menu_item_6) {
		this.menu_item_6 = menu_item_6;
	}

	public int getMenu_item_7() {
		return menu_item_7;
	}

	public void setMenu_item_7(int menu_item_7) {
		this.menu_item_7 = menu_item_7;
	}

	public int getMenu_item_8() {
		return menu_item_8;
	}

	public void setMenu_item_8(int menu_item_8) {
		this.menu_item_8 = menu_item_8;
	}

	public int getMenu_item_9() {
		return menu_item_9;
	}

	public void setMenu_item_9(int menu_item_9) {
		this.menu_item_9 = menu_item_9;
	}

	public int getMenu_item_10() {
		return menu_item_10;
	}

	public void setMenu_item_10(int menu_item_10) {
		this.menu_item_10 = menu_item_10;
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
}
