package com.pro.bean;

public class Transcation {
	private long tid;
	private long fromAcc;
	private long toAcc;
	private long oldBal;
	private long newbal;
	private String transType;

	public long getTid() {
		return tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	public long getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(long fromAcc) {
		this.fromAcc = fromAcc;
	}

	public long getToAcc() {
		return toAcc;
	}

	public void setToAcc(long toAcc) {
		this.toAcc = toAcc;
	}

	public long getOldBal() {
		return oldBal;
	}

	public void setOldBal(long oldBal) {
		this.oldBal = oldBal;
	}

	public long getNewbal() {
		return newbal;
	}

	public void setNewbal(long newbal) {
		this.newbal = newbal;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	@Override
	public String toString() {
		return "Transcation [tid=" + tid + ", fromAcc=" + fromAcc + ", toAcc=" + toAcc + ", oldBal=" + oldBal
				+ ", newbal=" + newbal + ", transType=" + transType + "]";
	}

}
