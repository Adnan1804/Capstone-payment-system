package com.capstone.paymentsystem.bills;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capstone.paymentsystem.registeredbillers.RegisteredBillers;

@Entity
@Table(name = "Bills_table")
public class Bills {

	@ManyToMany
	@JoinColumn(name = "Biller_Code", referencedColumnName = "Biller_Code", nullable = false)
	@JoinColumn(name = "ConsumerNumber", referencedColumnName = "ConsumerNumber", nullable = false)
	Set<RegisteredBillers> registeredBillers;

	@Id
	@Column(name = "Bill_ID", unique = true, nullable = false)
	private String BillId;

	@Column(nullable = false)
	private String Account_Number;
	@Column(nullable = false)
	private Boolean AutoPay;
	@Column(nullable = false)
	private Float AutoPay_Limit;

	public String getBillId() {
		return BillId;
	}

	public void setBillId(String billId) {
		BillId = billId;
	}

	public Set<RegisteredBillers> getRegisteredBillers() {
		return registeredBillers;
	}

	public void setRegisteredBillers(Set<RegisteredBillers> registeredBillers) {
		this.registeredBillers = registeredBillers;
	}

	public String getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(String account_Number) {
		Account_Number = account_Number;
	}

	public Boolean getAutoPay() {
		return AutoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		AutoPay = autoPay;
	}

	public Float getAutoPay_Limit() {
		return AutoPay_Limit;
	}

	public void setAutoPay_Limit(Float autoPay_Limit) {
		AutoPay_Limit = autoPay_Limit;
	}
}