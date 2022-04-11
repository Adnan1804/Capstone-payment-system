package com.capstone.paymentsystem.users;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capstone.paymentsystem.accounts.Accounts;
import com.capstone.paymentsystem.role.Role;

@Entity
@Table(name = "User_table")
public class Users {
	@Id
	@Column(name = "Login_ID", nullable = false, unique = true)
	private String loginId;
	@Column(nullable = false)
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AccountSequenceId", referencedColumnName = "Sequence_ID", unique = true, nullable = false)
	private Accounts accounts;
	
	@ManyToOne
	@JoinColumn(name = "RoleID", referencedColumnName = "RoleId", nullable = false)
	private Role role;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}