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
	public void deleteMedicine(int sid) {
		Stock stock = new Stock();
		stock.setSid(sid);
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.delete(stock);
		session.getTransaction().commit();
		
		
	}

	@Override
	public void updateStock(Stock stock, int sid) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Stock s = (Stock) session.get(Stock.class, sid);
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
	public Stock queryStock(int sid) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Stock stock = (Stock) session.get(Stock.class, sid);
		
		
		
		return stock;
	}

	@Override
	public Long getCountStock() {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		String hql = "select count(*) from Stock";
		Long count = (Long) session.createQuery(hql)
				.iterate().next();
		session.getTransaction().commit();
		return count;
	}

}
