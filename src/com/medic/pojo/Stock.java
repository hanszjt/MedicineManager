package com.medic.pojo;

public class Stock {
	private int sid;
	private String mname;
	private int count;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
		return "Stock [sid=" + sid + ", mname=" + mname + ", count=" + count + "]";
	}
	
	
	
	
	
	
	
}
