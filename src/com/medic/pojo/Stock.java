package com.medic.pojo;

public class Stock {
	private int mid;
	private String mname;
	private int count;
	
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Stock [mid=" + mid + ", mname=" + mname + ", count=" + count + "]";
	}
	
	
	
}
