package com.medic.service;

import javax.servlet.http.HttpServletRequest;

import com.medic.pojo.Sale;

public interface SaleService {
	public void searcMedicine(HttpServletRequest request,String mname);
	
	public void salelist(HttpServletRequest request);

	public void deletesale(Sale sale);
}
