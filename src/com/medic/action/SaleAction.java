package com.medic.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.medic.pojo.Sale;
import com.medic.service.MedicineService;
import com.medic.service.SaleService;
import com.medic.service.StockService;
import com.medic.service.impl.MedicineServiceImpl;
import com.medic.service.impl.SaleServiceImpl;
import com.medic.service.impl.StockServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class SaleAction extends ActionSupport {
	private String mname;
	private Sale sale;
	
	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String stocklist() {
		HttpServletRequest request = ServletActionContext.getRequest();
		StockService ss = new StockServiceImpl();
		ss.getStockList(request);
		return SUCCESS;
	}
	
	public String searcMedicine() {
		HttpServletRequest request = ServletActionContext.getRequest();
		SaleService ss = new SaleServiceImpl();
		System.out.println(mname);
		ss.searcMedicine(request, this.mname);
		return SUCCESS;
	}
	
	public String salelist() {
		HttpServletRequest request = ServletActionContext.getRequest();
		SaleService ss = new SaleServiceImpl();
		ss.salelist(request);
		
		return SUCCESS;
	}
	
	public String deletesale() {
		HttpServletRequest request = ServletActionContext.getRequest();
		SaleService ss = new SaleServiceImpl();
		ss.deletesale(this.sale);
		return SUCCESS;
	}
	
	public String querymedicine() {
		HttpServletRequest request = ServletActionContext.getRequest();
		StockService ms = new StockServiceImpl();
		ms.getStockList(request);
		return SUCCESS;
	}
	
	public String addsale() {
		SaleService ss = new SaleServiceImpl();
		ss.addsale(this.sale);
		return null;
	}
}
