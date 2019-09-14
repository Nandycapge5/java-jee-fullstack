package com.mob.service;

import com.mob.bean.Account;

public interface AccountService {
	
	
Account getAccountDetails(String mobileNo);
int rechargeAccount(String mobileno,double rechargeAmount);
boolean checkNumber(String mobileNo);
}
