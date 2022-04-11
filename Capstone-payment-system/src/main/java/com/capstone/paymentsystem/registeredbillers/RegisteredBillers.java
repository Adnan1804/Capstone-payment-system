package com.capstone.paymentsystem.registeredbillers;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capstone.paymentsystem.accounts.Accounts;
import com.capstone.paymentsystem.masterbiller.MasterBiller;

@Entity
@Table(name = "RegisteredBillers_table")
public class RegisteredBillers {

	@ManyToMany
	@JoinColumn(name = "AccountNumber", referencedColumnName = "Account_Number", nullable = false)
	Set<Accounts> accounts;

	@Id
	@Column(name = "Biller_ID", unique = true, nullable = false)
	private String BillerId;
	@OneToOne
	@JoinColumn(name = "Biller_Code", referencedColumnName = "BillerCode", unique = true, nullable = false)
	private MasterBiller masterbiller;
	@Column(name = "ConsumerNumber", nullable = false)
	private String ConsumerNumber;
	@Column(name = "AutoPay", nullable = false)
	private Boolean AutoPay;
	@Column(name = "AutoPay_Limit", nullable = false)
	private Float AutoPay_Limit;

	public String getBillerId() {
		return BillerId;
	}

	public void setBillerId(String billerId) {
		BillerId = billerId;
	}

	public MasterBiller getMasterbiller() {
		return masterbiller;
	}

	public void setMasterbiller(MasterBiller masterbiller) {
		this.masterbiller = masterbiller;
	}

}
