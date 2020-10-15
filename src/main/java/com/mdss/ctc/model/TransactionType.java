package com.mdss.ctc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction_type")
public class TransactionType
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_type_id")
	private int transaction_type_id;
	
	@Column(name = "transaction_type_name")
	private String transaction_type_name;

	public int getTransaction_type_id() {
		return transaction_type_id;
	}

	public void setTransaction_type_id(int transaction_type_id) {
		this.transaction_type_id = transaction_type_id;
	}

	public String getTransaction_type_name() {
		return transaction_type_name;
	}

	public void setTransaction_type_name(String transaction_type_name) {
		this.transaction_type_name = transaction_type_name;
	}
}
