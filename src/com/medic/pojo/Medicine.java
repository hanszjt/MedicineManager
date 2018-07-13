package com.medic.pojo;

/**
 * 药品实体类
 * @author 张金倓
 *
 */
public class Medicine {
	private int id;//药品编号
	private String mname;//药品名称
	private String mformat;//规格
	private String maddress;//药品产地
	private String mnumber;//批号
	private double inprice;//进价
	private double saleprice;//售价
	private double someprice;//批发价
	private String category;//类别
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMformat() {
		return mformat;
	}
	public void setMformat(String mformat) {
		this.mformat = mformat;
	}
	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	public String getMnumber() {
		return mnumber;
	}
	public void setMnumber(String mnumber) {
		this.mnumber = mnumber;
	}
	public double getInprice() {
		return inprice;
	}
	public void setInprice(double inprice) {
		this.inprice = inprice;
	}
	public double getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}
	public double getSomeprice() {
		return someprice;
	}
	public void setSomeprice(double someprice) {
		this.someprice = someprice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", mname=" + mname + ", mformat=" + mformat + ", maddress=" + maddress
				+ ", mnumber=" + mnumber + ", inprice=" + inprice + ", saleprice=" + saleprice + ", someprice="
				+ someprice + ", category=" + category + "]";
	}
	
	
	
	
}
