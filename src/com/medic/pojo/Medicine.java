package com.medic.pojo;

/**
 * ҩƷʵ����
 * @author �Ž���
 *
 */
public class Medicine {
	private int id;//ҩƷ���
	private String mname;//ҩƷ����
	private String mformat;//���
	private String maddress;//ҩƷ����
	private String mnumber;//����
	private double inprice;//����
	private double saleprice;//�ۼ�
	private double someprice;//������
	private String category;//���
	
	
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
