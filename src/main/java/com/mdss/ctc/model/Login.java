package com.mdss.ctc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "login")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Login 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_id")
	private int login_id;
	
	@OneToOne
	@JoinColumn(name = "login_id", insertable = false, updatable = false)
	private LoginMenuAccess access_list;
	
	@Column(name = "user_name")
	private String user_name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "full_name")
	private String full_name;
	
	@Column(name = "login_as")
	private String login_as;
	
	@Column(name = "is_active")
	private boolean is_active;
	
	@Column(name = "created_date")
	private Date created_date;
	
	@Column(name = "created_user_id")
	private int created_user_id;
	
	@Column(name = "last_modified_date")
	private Date last_modified_date;
	
	@Column(name = "last_modified_user_id")
	private int last_modified_user_id;
	
	public int getId()
	{
		return login_id;
	}
	
	public void setId(int login_id)
	{
		this.login_id = login_id;
	}
	
	public String getUser_name()
	{
		return user_name;
	}
	
	public void setUser_name(String user_name)
	{
		this.user_name = user_name;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getFull_name()
	{
		return full_name;
	}
	
	public void setFull_name(String full_name)
	{
		this.full_name = full_name;
	}
	
	public String getLogin_as()
	{
		return login_as;
	}
	
	public void setLogin_as(String login_as)
	{
		this.login_as = login_as;
	}
	
	public boolean isIs_active()
	{
		return is_active;
	}
	
	public void setIs_active(boolean is_active)
	{
		this.is_active = is_active;
	}
	
	public Date getCreated_date()
	{
		return created_date;
	}
	
	public void setCreated_date(Date created_date)
	{
		this.created_date = created_date;
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public int getCreated_user_id() {
		return created_user_id;
	}

	public void setCreated_user_id(int created_user_id) {
		this.created_user_id = created_user_id;
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

	public LoginMenuAccess getAccess_list() {
		return access_list;
	}

	public void setAccess_list(LoginMenuAccess access_list) {
		this.access_list = access_list;
	}
}
 