package com.medic.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.medic.dao.EmployeeDao;
import com.medic.pojo.Employee;
import com.medic.util.HibernateUtils;


public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean addEmployee(Employee employee) {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteEmployeeByName(String ename) {
		Session session = HibernateUtils.getSession();
		session.getTransaction().begin();
		String sql = "delete from Employee where ename =?";
		Query query = session.createQuery(sql);
		query.setString(0, ename);
		query.executeUpdate();
		System.out.println("数据库删除操作");
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteEmployeeByID(Integer id) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(id);
		Session session = HibernateUtils.getSession();
		session.getTransaction().begin();
		session.clear();
		session.delete(employee);
		System.out.println("数据库删除操作");
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean deleteEmployeeByIDCard(String idcard) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSession();
		session.getTransaction().begin();
		String sql = "delete from Employee where idcard =?";
		Query query = session.createQuery(sql);
		query.setString(0, idcard);
		query.executeUpdate();
		System.out.println("数据库删除操作");
		session.getTransaction().commit();
		return false;
	}

	@Override
	public boolean updateEmployeeByName(Employee employee, String ename) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeByID(Employee employee, Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeByIDCard(Employee employee, String idcard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> queryAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeByName(String ename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeByIDCard(String idcard) {
		// TODO Auto-generated method stub
		return null;
	}

}
