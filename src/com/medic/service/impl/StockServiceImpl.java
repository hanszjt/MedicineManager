package com.medic.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.medic.dao.StockDao;
import com.medic.dao.impl.StockDaoImpl;
import com.medic.page.Pager;
import com.medic.page.PagerHelper;
import com.medic.pojo.Medicine;
import com.medic.pojo.Stock;
import com.medic.service.StockService;

public class StockServiceImpl implements StockService {
	private StockDao sd = new StockDaoImpl();
	@Override
	public void getStockList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		Pager pager = null;
		long totalRows = 0;
		int pageSize = 10;
		totalRows = sd.getCountStock();
		pager = PagerHelper.getPager(request, (int)totalRows, pageSize);
		pager.setLinkUrl("listAllPage.action"); // ������ת·����Ҳ�����ǣ�&
		request.setAttribute("total", totalRows);
		request.setAttribute("pb", pager); // ����ҳ��Ϣ������Request����pb��
		List<Stock> list = sd.queryAllStock(pager);
		/*for (Stock stock : list) {
			System.out.println(stock);
		}*/
		request.setAttribute("stockList", list);
	}

	@Override
	public void updatestock(Stock stock, int id) {
		sd.updateStock(stock, id);
		
	}

	@Override
	public void addstock(Stock stock) {
		sd.addMedicine(stock);
		
	}


}
