package com.medic.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.medic.pojo.Stock;
import com.medic.service.MedicineService;
import com.medic.service.StockService;
import com.medic.service.impl.MedicineServiceImpl;
import com.medic.service.impl.StockServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class StockAction extends ActionSupport{
	private Stock stock;
	
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public String stocklist() {
		HttpServletRequest request = ServletActionContext.getRequest();
		StockService ss = new StockServiceImpl();
		ss.getStockList(request);
		return SUCCESS;
	}
	public String updatestock() {
		StockService ss = new StockServiceImpl();
		ss.updatestock(this.stock, stock.getSid());
		return SUCCESS;
	}
	
	public String querymedicinename() {
		HttpServletRequest request = ServletActionContext.getRequest();
		MedicineService ms = new MedicineServiceImpl();
		ms.getMedicineList(request);
		return SUCCESS;
	}
	
	public String addstock() {
		StockService ss = new StockServiceImpl();
		ss.addstock(this.stock);
		return null;
	}
}
