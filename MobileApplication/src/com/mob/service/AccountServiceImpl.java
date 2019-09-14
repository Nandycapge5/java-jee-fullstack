package com.mob.service;

import com.mob.bean.Account;
import com.mob.dao.AccountDao;
import com.mob.dao.AccountDaoImpl;


public class AccountServiceImpl implements AccountService {
	AccountDao dao =  new AccountDaoImpl();

	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		return dao.getAccountDetails( mobileNo);
	}

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) {
		// TODO Auto-generated method stub
		
		
		
		return dao.rechargeAccount(mobileno, rechargeAmount);
	}
	
	@Override
	public boolean checkNumber(String mobileNo) {
		
		//String mob=Long.toString(mobileNo);
		
		if(!mobileNo.matches("[6-9][0-9]{9}"))
		return true;
		else
		return false;
		
	} 

	
}
