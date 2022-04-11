package com.capstone.paymentsystem.masterbiller;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capstone.paymentsystem.registeredbillers.RegisteredBillers;

@Entity
@Table(name = "MasterBiller_table")
public class MasterBiller {

	@ManyToMany
	@JoinColumn(name = "Biller_Code", referencedColumnName = "Biller_Code", nullable = false)
	Set<RegisteredBillers> registeredBillers;

	
	@Id
	@Column(nullable = false)
	private String BillerCode;
	
	@Column(name = "Name")
	private String BillerName;

	public String getBillerName() {
		return BillerName;
	}

	public void setBillerName(String billerName) {
		BillerName = billerName;
	}

	public MasterBiller(String billerName) {
		super();
		BillerName = billerName;
	}

	
	
	
	
}