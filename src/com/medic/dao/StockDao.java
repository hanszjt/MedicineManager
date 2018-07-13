package com.medic.dao;

import java.util.List;

import com.medic.page.Pager;
import com.medic.pojo.Stock;

/**
 * �ֿ����ӿ�
 * @author �Ž���
 *
 */
public interface StockDao {
	public void addMedicine(Stock stock);
	
	public void deleteMedicine(int mid);
	
	public void updateStock(Stock stock , int mid);
	
	public List<Stock> queryAllStock(Pager pager);

	public Stock queryStock(int mid);
}
