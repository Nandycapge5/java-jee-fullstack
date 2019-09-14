package com.mob.dao;

import java.util.HashMap;
import java.util.Map;

import com.mob.bean.Account;
import com.mob.except.AccountIdNotFoundException;


public class AccountDaoImpl implements AccountDao {
	
	 Map<String,Account> accountEntry;  
	 public AccountDaoImpl() { 
		 accountEntry=new HashMap<>(); 	
		 accountEntry.put("9010210131",new Account("Prepaid", "Vaishali", 200)); 
		 accountEntry.put("9823920123",new Account("Prepaid", "Megha", 453)); 
		 accountEntry.put("9932012345",new Account("Prepaid", "Vikash", 631)); 	
		 accountEntry.put("9010210131",new Account("Prepaid", "Anju", 521)); 	
		 accountEntry.put("9010210131",new Account("Prepaid", "Tushar", 632)); 	 } 	
	 
	

	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		 Account account=accountEntry.get(mobileNo); 		
		 if (account==null) 			
		 
			throw new AccountIdNotFoundException("Given Account Id Does Not Exists"); 		
		 
		
			 
		 return account;
		 
		//return accountEntry.put(mobileNo, );
		 
	}



	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		// TODO Auto-generated method stub
		
		 Account account=accountEntry.get(mobileNo);
	        int balance;
	        if(account==null)//if account not found
	         throw new AccountIdNotFoundException("ERROR:Cannot Recharge Account as Given Mobile Number doesnot exist");
	        else         
	        balance= (int) (account.getAccountBalance()+rechargeAmount);
	          account.setAccountBalance(balance);
	        
	        return balance;
		
	}

}
