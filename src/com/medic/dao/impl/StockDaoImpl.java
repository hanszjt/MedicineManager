package com.medic.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.medic.dao.StockDao;
import com.medic.page.Pager;
import com.medic.pojo.Stock;
import com.medic.util.HibernateUtils;

public class StockDaoImpl implements StockDao{

	@Override
	public void addMedicine(Stock stock) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.save(stock);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteMedicine(int mid) {
		Stock stock = new Stock();
		stock.setMid(mid);
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.delete(stock);
		session.getTransaction().commit();
		
		
	}

	@Override
	public void updateStock(Stock stock, int mid) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Stock s = (Stock) session.get(Stock.class, mid);
		s.setCount(stock.getCount());
		s.setMname(stock.getMname());
		session.update(s);
		session.getTransaction().commit();
		
	}

	@Override
	public List<Stock> queryAllStock(Pager pager) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		String hql ="from Stock";
		Query query = session.createQuery(hql);
		query.setFirstResult(pager.getStartRow());
		query.setMaxResults(pager.getPageSize());
		List<Stock> list = query.list();
		session.getTransaction().commit();
		return list;
	}

	@Override
	public Stock queryStock(int mid) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Stock stock = (Stock) session.get(Stock.class, mid);
		
		
		
		return stock;
	}

}
