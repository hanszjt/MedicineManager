package com.medic.service;

import javax.servlet.http.HttpServletRequest;

import com.medic.pojo.Sale;
import com.medic.pojo.Stock;

public interface SaleService {
	public void searcMedicine(HttpServletRequest request,String mname);
	
	public void salelist(HttpServletRequest request);

	public void deletesale(Sale sale);
	
	public void addsale(Sale sale);
}
