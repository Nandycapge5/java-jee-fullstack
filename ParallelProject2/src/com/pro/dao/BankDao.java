package com.pro.dao;

import java.util.List;

import com.pro.bean.Bank;
import com.pro.bean.Transcation;

public interface BankDao {
	Bank createAccount(Bank bank);

	Bank showBalance(long accNo); 

	Bank deposit(long accNo1, int depositAmt);

	Bank withdraw(long accNo1, int withdrawAmt);

	long FundTransfer(long accNo3, long accNo4, long amount);

	List<Transcation> printTranscation();
}
