package com.medic.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.medic.dao.SaleDao;
import com.medic.page.Pager;
import com.medic.pojo.Sale;
import com.medic.util.HibernateUtils;

public class SaleDaoImpl implements SaleDao {

	@Override
	public void addSale(Sale sale) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.save(sale);
		session.getTransaction().commit();
	}

	@Override
	public void deleteSale(int id) {
		Sale s = new Sale();
		s.setId(id);
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.delete(s);
		session.getTransaction().commit();
	}

	@Override
	public void updateSale(Sale sale, int id) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Sale s = (Sale) session.get(Sale.class, id);
		s.setCount(sale.getCount());
		s.setMid(sale.getMid());
		s.setMname(sale.getMname());
		s.setSaleprice(sale.getSaleprice());
		s.setSid(sale.getSid());
		session.update(s);
		session.getTransaction().commit();
	}

	@Override
	public List<Sale> queryAllSale(Pager pager) {
		Session session = HibernateUtils.getSession();
		String hql = "from Sale";
		session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setFirstResult(pager.getStartRow());
		query.setMaxResults(pager.getPageSize());
		List<Sale> list = query.list();
		session.getTransaction().commit();
		return list;
	}

	@Override
	public Sale querySale(int id) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Sale sale = (Sale) session.get(Sale.class, id);
		session.getTransaction().commit();
		return sale;
	}

}
