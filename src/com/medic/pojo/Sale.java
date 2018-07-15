package com.medic.pojo;

public class Sale {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String sid;
	private Integer mid;
	private String mname;
	private Integer count;
	private Double saleprice;
	
	
	public Double getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
	
	
}
