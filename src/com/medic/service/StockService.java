package com.medic.service;

import javax.servlet.http.HttpServletRequest;

import com.medic.pojo.Stock;

public interface StockService {
	public void getStockList(HttpServletRequest request);
	
	public void updatestock(Stock stock,int id);
	
	public void addstock(Stock stock);
}
