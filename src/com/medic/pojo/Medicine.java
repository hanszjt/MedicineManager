package com.medic.pojo;

import java.util.Date;

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
	private Double inprice;//����
	private Double saleprice;//�ۼ�
	private Double someprice;//������
	public Double getInprice() {
		return inprice;
	}
	public void setInprice(Double inprice) {
		this.inprice = inprice;
	}
	public Double getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}
	public Double getSomeprice() {
		return someprice;
	}
	public void setSomeprice(Double someprice) {
		this.someprice = someprice;
	}
	private String category;//���
	private Date safedate;//������
	
	
	

	public Date getSafedate() {
		return safedate;
	}
	public void setSafedate(Date safedate) {
		this.safedate = safedate;
	}
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
