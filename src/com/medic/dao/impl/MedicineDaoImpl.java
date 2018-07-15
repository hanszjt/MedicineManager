package com.medic.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.medic.dao.MedicineDao;
import com.medic.page.Pager;
import com.medic.pojo.Medicine;
import com.medic.pojo.User;
import com.medic.util.HibernateUtils;

public class MedicineDaoImpl implements MedicineDao {

	@Override
	public void addMedicine(Medicine medicine) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.save(medicine);
		session.getTransaction().commit();
	}

	@Override
	public void deleteMedicine(int id) {
		Medicine m = new Medicine();
		m.setId(id);
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.delete(m);
		session.getTransaction().commit();

	}

	@Override
	public void updateMedicine(Medicine medicine, int id) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Medicine m = (Medicine) session.get(Medicine.class, id);
		m.setCategory(medicine.getCategory());
		m.setInprice(medicine.getInprice());
		m.setMaddress(medicine.getMaddress());
		m.setMformat(medicine.getMformat());
		m.setMname(medicine.getMname());
		m.setMnumber(medicine.getMnumber());
		m.setSaleprice(medicine.getSaleprice());
		m.setSomeprice(medicine.getSomeprice());
		session.update(m);
		session.getTransaction().commit();
	}

	@Override
	public List<Medicine> queryAllMedicine(Pager pager) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		String hql = "from Medicine";
		Query query = session.createQuery(hql);
//		query.setFirstResult(pager.getStartRow());
//		query.setMaxResults(pager.getPageSize());
		List<Medicine> list = query.list();
		session.getTransaction().commit();
		return list;
	}

	@Override
	public Medicine queryMedicineByID(int id) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Medicine medicine = (Medicine) session.get(Medicine.class, id);
		return medicine;
	}

	@Override
	public Long getCountMedicine() {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		String hql = "select count(*) from Medicine";
		Long count = (Long) session.createQuery(hql)
				.iterate().next();
		session.getTransaction().commit();
		return count;

	}

	@Override
	public List<Medicine> queryMedicineByName(String name) {
		Session session = HibernateUtils.getSession();
		session.getTransaction().begin();
		String sql = "from Medicine where mname =?";
		Query query = session.createQuery(sql);
		query.setString(0, name);
		List<Medicine> list = query.list();
		System.out.println("Êý¾Ý¿âchaxun²Ù×÷");
		session.getTransaction().commit();
		return list;
	}

}
