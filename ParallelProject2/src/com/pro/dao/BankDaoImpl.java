package com.pro.dao;

import com.pro.except.AccountNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pro.bean.Bank;
import com.pro.bean.Transcation;

public class BankDaoImpl implements BankDao {
	// creating map to store user information
	Map<Long, Bank> banks = new HashMap<Long, Bank>();
	// creating another map to store all transaction
	Map<Transcation, Long> trans = new HashMap<Transcation, Long>();

	@Override // storing user info to map
	public Bank createAccount(Bank bank) {
		banks.put(bank.getAccNo(), bank);

		return banks.get(bank.getAccNo());

	}

	// retrieveing balance of specific user
	public Bank showBalance(long accNo) {
		// retrieveing info from banks using get
		Bank bank = banks.get(accNo);
		if (bank == null) {
			throw new AccountNotFoundException("No Account found with this given account number");
		}
		return bank;

	}

	@Override // deposit amount in user account

	public Bank deposit(long accNo1, int depositAmt) {
		// retrieveing info from banks using get

		Bank amount = banks.get(accNo1);
		long balance1 = amount.getAccBalance();
		long balance2 = balance1 + depositAmt;
		amount.setAccBalance(balance2);
		// creating object for all transaction
		Transcation t = new Transcation();
		t.setTid(123);
		t.setFromAcc(accNo1);
		t.setOldBal(balance1);
		t.setNewbal(balance2);
		String accType = "savings";
		t.setTransType("Deposit");
		trans.put(t, accNo1);
		return amount;

	}

	@Override // withdraw amount in user account
	public Bank withdraw(long accNo1, int withdrawAmt) {
		// retrieveing info from banks using get
		Bank amount = banks.get(accNo1);
		if (amount != null) {
		}
		long balance1 = amount.getAccBalance();
		long balance2 = balance1 - withdrawAmt;
		amount.setAccBalance(balance2);
		// creating object for all transaction
		Transcation t = new Transcation();
		t.setTid(123);
		t.setFromAcc(accNo1);
		t.setOldBal(balance1);
		t.setNewbal(balance2);
		String accType = "savings";
		t.setTransType("WithDrawn");
		trans.put(t, accNo1);

		return amount;

	}

	// Fund Transfering one account to other  account
	public long FundTransfer(long accNo3, long accNo4, long amount) {
		Bank amount1 = banks.get(accNo3);

		Bank amount2 = banks.get(accNo4);
		long frombal = amount1.getAccBalance();
		long tobal = amount2.getAccBalance();
		long fromupdatebal = frombal - amount;
		long toupdatebal = tobal + amount;
		amount1.setAccBalance(fromupdatebal);
		amount2.setAccBalance(toupdatebal);
		// creating object for all transaction
		Transcation t = new Transcation();
		//Setting information to AllTransaction
		t.setTid(123);
		t.setFromAcc(accNo3);
		t.setToAcc(accNo4);
		t.setOldBal(frombal);
		t.setNewbal(fromupdatebal);
		String accType = "savings";
		t.setTransType("FundTransfer");
		trans.put(t, accNo3);
		trans.put(t, accNo4);

		return fromupdatebal;

	}

	@Override
	public List<Transcation> printTranscation() {
		System.out.println(trans.size());
		List<Transcation> list = new ArrayList<Transcation>(trans.keySet());
		return list;
	}

}
