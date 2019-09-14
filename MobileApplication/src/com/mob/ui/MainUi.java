package com.mob.ui;

import java.util.Scanner;

import com.mob.bean.Account;
import com.mob.service.AccountService;
import com.mob.service.AccountServiceImpl;



public class MainUi {
	
	static AccountService service = new AccountServiceImpl();//service class object creation

	static Scanner sc = new Scanner(System.in);
public static void main(String args[])

{  Account a=new Account(null, null, 0);//bean class object creation
 while(true)
 {  //Display menu to Customer Care
	 System.out.println("Mobile Recharge Application");
	 System.out.println("1.Account Balance Enquiry");
	 System.out.println("2.Recharge Account");
	 System.out.println("3.Exit");
	 System.out.println("Enter the option");
	 int option=sc.nextInt();
	 switch (option) {
	 case 1:
		 try{
			 
		 boolean isOkNum=false;
		 String mobileNo=null;
		 do
		 {   
		 System.out.println("Enter the mobile number");
	 
	  mobileNo=sc.next();
	 isOkNum = service.checkNumber(mobileNo);
	
	//User friendly suggestion
     if (isOkNum) {
         System.out.println("Enter the valid mobile number\n");
     }
 } while (isOkNum);  
Account account=service.getAccountDetails(mobileNo);
double balance=account.getAccountBalance();
System.out.println("Your Current Balance is Rs."+balance);}

  catch(Exception ae)
{
 System.out.println("Given Account Id Does Not Exists");
} 
break;
case 2:
		 System.out.println("Enter the MobileNo:");
         String mobileNo=sc.next();
         System.out.println("Enter recharge Amount");
         float rechargeAmount=sc.nextFloat();
         if(rechargeAmount>=10)
         {
         Account accountDetails=service.getAccountDetails(mobileNo);
         int account1=service.rechargeAccount(mobileNo, rechargeAmount);
         String name=accountDetails.getCustomerName();
         double balance1=accountDetails.getAccountBalance();
         System.out.println("Your Account Recharged Successfully");
         System.out.println("Hello "+name+"Available Balance is "+balance1);
         }
         else
         {
        	 System.out.println("Recharge amount must be greater than 10");
         }
         break;
	 case 3:
		 System.out.println("Thank you");
		 System.exit(0);
		
		 default:
			 break;
 }
 }
}
}

