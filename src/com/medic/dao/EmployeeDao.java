package com.medic.dao;

import java.util.List;

import com.medic.pojo.Employee;

/**
 * 职工接口
 * @author 吴东辉
 *
 */
public interface EmployeeDao {
	/**
	 * 添加用户
	 * @param employee
	 * @return 是否成功
	 */
	public boolean addEmployee(Employee employee);
	/**
	 * 根据姓名删除职工
	 * @param ename
	 * @return
	 */
	public boolean deleteEmployeeByName(String ename);
	/**
	 * 根据职工编号删除职工
	 * @param id
	 * @return
	 */
	public boolean deleteEmployeeByID(Integer id);
	/**
	 * 根据职工身份证号删除职工
	 * @param idcard
	 * @return
	 */
	public boolean deleteEmployeeByIDCard(String idcard);
	/**
	 * 根据职工姓名修改职工信息
	 * @param employee
	 * @param ename
	 * @return
	 */
	public boolean updateEmployeeByName(Employee employee , String ename);
	/**
	 * 根据职工编号修改职工信息
	 * @param employee
	 * @param id
	 * @return
	 */
	public boolean updateEmployeeByID(Employee employee , Integer id);
	/**
	 * 根据职工身份证号修改职工信息
	 * @param employee
	 * @param idcard
	 * @return
	 */
	public boolean updateEmployeeByIDCard(Employee employee , String idcard);
	public List<Employee> queryAllEmployee();
	/**
	 * 根据职工姓名查询职工
	 * @param ename
	 * @return
	 */
	public Employee findEmployeeByName(String ename);
	/**
	 * 根据职工编号查询职工
	 * @param id
	 * @return
	 */
	public Employee findEmployeeByID(Integer id);
	/**
	 * 根据职工身份证号查询职工
	 * @param idcard
	 * @return
	 */
	public Employee findEmployeeByIDCard(String idcard);
}
