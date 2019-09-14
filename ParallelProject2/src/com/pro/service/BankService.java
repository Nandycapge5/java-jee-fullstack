package com.pro.service;

import java.util.List;

import com.pro.bean.Bank;
import com.pro.bean.Transcation;

public interface BankService {
	
	boolean custNameOk(String custName);
	boolean mobileNumber(long mobNo);
	boolean accountType(String accType1);
	Bank createAccount(Bank bank);

	Bank showBalance(long accNo); //throws Exception;

	Bank deposit(long accNo1, int depositAmt);

	Bank withdraw(long accNo1, int withdrawAmt);

	long FundTransfer(long accNo1, long accNo2, long amount);

	List<Transcation> printTranscation();

}
