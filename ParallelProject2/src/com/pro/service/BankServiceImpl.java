package com.pro.service;

import java.util.List;

import com.pro.bean.Bank;
import com.pro.bean.Transcation;
import com.pro.dao.BankDao;
import com.pro.dao.BankDaoImpl;

public class BankServiceImpl implements BankService {
	//creating object for bankdao
	BankDao dao = new BankDaoImpl();
//creating new account
	public Bank createAccount(Bank bank) {
		return dao.createAccount(bank);
	}

	@Override //showing your balance
	public Bank showBalance(long accNo) {
		//calling showBalance method in BankDaoImpl
		Bank banks = dao.showBalance(accNo);
		return banks;

	}

	@Override//deposit 
	public Bank deposit(long accNo1, int depositAmt) {
		//calling deposit method in BankDaoImpl

		return dao.deposit(accNo1, depositAmt);

	}

	@Override//withdraw
	public Bank withdraw(long accNo1, int withdrawAmt) {
		//calling withdraw method in BankDaoImpl

		return dao.withdraw(accNo1, withdrawAmt);
	}

	@Override//FundTransfer
	public long FundTransfer(long accNo3, long accNo4, long amount) {
		//calling FundTransfer method in BankDaoImpl

		return dao.FundTransfer(accNo3, accNo4, amount);
	}

	@Override//Transcation
	public List<Transcation> printTranscation() {
		//calling printTransaction in BankDaoImpl

		return dao.printTranscation();
	}

	@Override
	public boolean custNameOk(String custName) {
		//validating the username
		if (custName.matches("[A-Z][a-zA-Z]*"))
			return true;
		else
			return false;

	}

	@Override
	public boolean mobileNumber(long mobNo) {
		// TODO Auto-generated method stub
		//validating the mobileNumber

		String mob = Long.toString(mobNo);
		if (mob.matches("[6-9][0-9]{9}"))
			return true;
		else
			return false;
	}

	@Override
	public boolean accountType(String accType1) {
		//validating the accountType

		if(accType1.equalsIgnoreCase("savings")||accType1.equalsIgnoreCase("current"))
		return true;
		else
			return false;
	}

}
