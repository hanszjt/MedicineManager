package com.medic.dao;

import java.util.List;

import com.medic.page.Pager;
import com.medic.pojo.Stock;

/**
 * 仓库管理接口
 * @author 张金倓
 *
 */
public interface StockDao {
	public void addMedicine(Stock stock);
	
	public void deleteMedicine(int sid);
	
	public void updateStock(Stock stock , int sid);
	
	public List<Stock> queryAllStock(Pager pager);
	
	public Long getCountStock();

	public Stock queryStock(int sid);
}
