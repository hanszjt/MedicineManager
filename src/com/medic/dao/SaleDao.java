package com.medic.dao;

import java.util.List;

import com.medic.page.Pager;
import com.medic.pojo.Sale;

public interface SaleDao {
	public void addSale(Sale sale);
	
	public void deleteSale(int id);
	
	public void updateSale(Sale sale ,int id);
	
	public List<Sale> queryAllSale(Pager pager);
	
	public Sale querySale(int id);
}
