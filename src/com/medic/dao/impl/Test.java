package com.medic.dao.impl;

import java.util.List;

import com.medic.dao.MedicineDao;
import com.medic.dao.UserDao;
import com.medic.page.Pager;
import com.medic.pojo.Employee;
import com.medic.pojo.Medicine;
import com.medic.pojo.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee e = new Employee();
		e.setEname("test1");
		e.setEsex("ÄÐ");
		e.setEtel("13015099612");
		e.setAddress("ÄÚÃÉ¹ÅºôºÍºÆÌØ");
		e.setIdcard("11111111111");
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		edi.addEmployee(e);*/
	/*	EmployeeDaoImpl edi = new EmployeeDaoImpl();
		edi.deleteEmployeeByIDCard("11111111111");*/
		/*User u = new User();
		u.setPassword("123456");
		u.setPermission(2);
		u.setUsername("123456");
		UserDao ud = new UserDaoImpl();
		ud.updateUser(u, 1);*/
		Medicine m = new Medicine();
		m.setMname("222");
		m.setInprice(12.00);
		MedicineDao md = new MedicineDaoImpl();
		md.deleteMedicine(1);
		
	}
}
