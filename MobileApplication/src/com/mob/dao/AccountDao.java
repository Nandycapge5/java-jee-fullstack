package com.mob.dao;

import com.mob.bean.Account;

public interface AccountDao {

	Account getAccountDetails(String mobileNo);
	int rechargeAccount(String mobileNo, double rechargeAmount);
}
