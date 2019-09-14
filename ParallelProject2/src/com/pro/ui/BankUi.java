package com.pro.ui;

import com.pro.except.AccountNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.pro.bean.Bank;
import com.pro.bean.Transcation;
import com.pro.service.BankService;
import com.pro.service.BankServiceImpl;

public class BankUi {
	// creating service  object for Bankserviceimpl
	static BankService service = new BankServiceImpl();
														

	static Scanner scanner = new Scanner(System.in);// user input

	public static void main(String[] args) throws Exception {
		Bank bank = new Bank();// bean class object creation

		while (true) //getting input from users

		{
			System.out.println("WELCOME TO XYZ BANK   ");
			System.out.println("1.Create Account");
			System.out.println("2.Show Balance");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Fund Transcation");
			System.out.println("6.Print Transcation");
			System.out.println("Enter the option");
			int option = scanner.nextInt();

			switch (option) {
			case 1://creating Account
				
				String name;
				boolean isOkName = false;
				// Name validation
				do {
					System.out.println("Enter the customer name");
					name = scanner.next();
					isOkName = service.custNameOk(name);
					if (!isOkName) {
						System.out.println("Please enter alphabetics only");
					}
				} while (!isOkName);

				System.out.println("Enter the Branch Name:");
				String branch = scanner.next();
				
				String accType;
				boolean isOkType=false;
				//Account Type validation
				do{

				System.out.println("Enter the AccountType:");
				 accType = scanner.next();
				isOkType=service.accountType(accType);
				if(!isOkType)
				{
					System.out.println("Enter correct Account Type");
				}
				
				}while(!isOkType);
				System.out.println("Enter the Account Balance:");
				int accBalance = scanner.nextInt();
				System.out.println("Enter the MobileNo:");
			
				long mobileNo = 0;
				boolean isMobOk = false;
				// Mobile number validation
				do {

					mobileNo = scanner.nextLong();
					isMobOk = service.mobileNumber(mobileNo);
					// user friendly suggestion
					if (!isMobOk) {
						System.out.println("Enter the 10 digits number");
						System.out.println("Enter the valid mobile number");
					}
				} while (!isMobOk);

				long AccNo = mobileNo - 10000;
				System.out.println(" Your Account No is " + AccNo);
				System.out.println("Account is created");
				bank.setAccNo(AccNo);
				bank.setAccName(name);
				bank.setAccType(accType);
				bank.setBranch(branch);
				bank.setMobileNo(mobileNo);
				bank.setAccBalance(accBalance);
				Bank bankObj=service.createAccount(bank);
				System.out.println(bankObj);
				break;

			case 2://show balance

				try {
					System.out.println("Enter the Account Number:");
					long AccNo2 = scanner.nextLong();
					//calling show Balance method in BankServiceimpl
					Bank b3 = service.showBalance(AccNo2);
					System.out.println(b3);

				}
				// user defined Exception 
				catch (AccountNotFoundException e) {
					System.out.println("Enter valid account number");
				}

				break;
			case 3://deposit
				try {
					System.out.println("Enter your account number");
					Long accNo1 = scanner.nextLong();
					System.out.println("Enter the Amount to be deposited");
					int depositAmt = scanner.nextInt();
					//calling deposit method in BankServiceimpl
					Bank amount = service.deposit(accNo1, depositAmt);
					System.out.println("Updated Balance= " + amount.getAccBalance());
					System.out.println("*******AMOUNT DEPOSITED SUCCESSFULLY*******");
					System.out.println(amount);
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4://withdraw
				try {
					System.out.println("Enter your account number");
					Long accNo2 = scanner.nextLong();
					System.out.println("Enter the Amount to be Withdrawn");
					int withdrawAmt = scanner.nextInt();
					//calling withdraw method in BankServiceimpl

					Bank amount1 = service.withdraw(accNo2, withdrawAmt);
					System.out.println("Updated Balance= " + amount1.getAccBalance());
					System.out.println("*******AMOUNT DEPOSITED SUCCESSFULLY*******"); 
					System.out.println(amount1);
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 5://Fund Transfer
				System.out.println("Enter the first account number");
				Long accNo3 = scanner.nextLong();
				System.out.println("Enter the second account number");
				Long accNo4 = scanner.nextLong();
				System.out.println("enter the amount");
				Long amount2 = scanner.nextLong();
				//calling Fund Transfer method in BankServiceimpl

				long fund = service.FundTransfer(accNo3, accNo4, amount2);
				System.out.println(fund);
				break;

			case 6://print all transaction
				System.out.println("Showing all the Transaction");
				List<Transcation> result = service.printTranscation();
				Iterator<Transcation> itr = result.iterator();
				while (itr.hasNext()) {
					Transcation tran = itr.next();
					System.out.println(tran);
				}
				break;

			case 7://exit
				System.out.println("Thank You");
				System.exit(0);
					
				default:
				break;
			}
		}
	}
}
