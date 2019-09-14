package com.pro.bean;

public class Bank {
	private String accName;
	private long accNo;
	private String accType;
	private String branch;
	private long accBalance;
	private long mobileNo;

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName1) {
		accName = accName1;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo1) {
		accNo = accNo1;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType1) {
		accType = accType1;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch1) {
		branch = branch1;
	}

	public long getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(long accBalance1) {
		accBalance = accBalance1;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo1) {
		mobileNo = mobileNo1;
	}

	@Override
	public String toString() {
		return "Bank [accName=" + accName + ", accNo=" + accNo + ", accType=" + accType + ", branch=" + branch
				+ ", accBalance=" + accBalance + ", mobileNo=" + mobileNo + "]";
	}

}
