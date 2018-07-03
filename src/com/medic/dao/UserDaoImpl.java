package com.medic.dao;



import org.hibernate.Session;

import com.medic.pojo.User;
import com.medic.util.HibernateUtils;

/**
 * 用户接口实现类
 * @author 苗欣
 *
 */
public class UserDaoImpl implements UserDao {


	
	@Override
	public boolean addUser(User u) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkUserLogin(String userName, String password) {
		Boolean returnValue = false;
		Session session = HibernateUtils.getSession();
		System.out.println(userName + password);
		String strHQl  = "select count(*) from User u where u.username =:name and" +
				" u.password =:p ";
		
		Long count = (Long) session.createQuery(strHQl)
									.setParameter("name", userName)
									.setParameter("p", password)
									.iterate().next();
		if(count>0)  returnValue = true;
		System.out.println(count);
		return returnValue;
	}

}
