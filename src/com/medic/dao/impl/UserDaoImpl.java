package com.medic.dao.impl;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import com.medic.dao.UserDao;
import com.medic.page.Pager;
import com.medic.pojo.User;
import com.medic.util.HibernateUtils;

/**
 * �û��ӿ�ʵ����
 * @author ����
 *
 */
public class UserDaoImpl implements UserDao {


	
	@Override
	public boolean addUser(User u) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		System.out.println("���ݿ���Ӳ���");
		return false;
	}

	@Override
	public Long getCountUser() {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		String hql = "select count(*) from User";
		Long count = (Long) session.createQuery(hql)
				.iterate().next();
		session.getTransaction().commit();
		return count;
	}

	
	@Override
	public boolean deleteUser(String username) {
		Session session = HibernateUtils.getSession();
		session.getTransaction().begin();
		String sql = "delete from Employee where ename =?";
		Query query = session.createQuery(sql);
		query.setString(0, username);
		query.executeUpdate();
		System.out.println("���ݿ�ɾ������");
		session.getTransaction().commit();
		return false;
	}

	@Override
	public User checkUserLogin(String userName, String password) {
		Boolean returnValue = false;
		Session session = HibernateUtils.getSession();
		System.out.println(userName + password);
		String hql = "from User u where u.username = "+"'"+userName+"' and u.password =" + "'" + password + "'";
		Query query = session.createQuery(hql);
		List list = query.list();
		User u = null;
		u = (User) list.get(0);
		System.out.println("���ݿ��½��֤����");
		return u;
	}

	@Override
	public List<User> queryAllUser(Pager pager) {
		Session session = HibernateUtils.getSession();
		String hql = "from User";
		Query query = session.createQuery(hql);
		query.setFirstResult(pager.getStartRow());
		query.setMaxResults(pager.getPageSize());
		List<User> myList =query.list();
		HibernateUtils.closeSession();
		System.out.println("���ݿ��ѯ����");
		return myList;
	}

	@Override
	public boolean updateUser(User user , int id) {
		Session session = HibernateUtils.getSession();
		session.getTransaction().begin();
		User user1 = (User) session.get(User.class, id);
		user1.setPassword(user.getPassword());
		user1.setPermission(user.getPermission());
		user1.setUsername(user.getUsername());
		session.update(user1);
		session.getTransaction().commit();
		System.out.println("���ݿ��޸Ĳ���");
		return false;
	}

	
}
