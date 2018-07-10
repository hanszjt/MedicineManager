package com.medic.dao;

import java.util.List;

import com.medic.pojo.Employee;

/**
 * ְ���ӿ�
 * @author �ⶫ��
 *
 */
public interface EmployeeDao {
	/**
	 * ����û�
	 * @param employee
	 * @return �Ƿ�ɹ�
	 */
	public boolean addEmployee(Employee employee);
	/**
	 * ��������ɾ��ְ��
	 * @param ename
	 * @return
	 */
	public boolean deleteEmployeeByName(String ename);
	/**
	 * ����ְ�����ɾ��ְ��
	 * @param id
	 * @return
	 */
	public boolean deleteEmployeeByID(Integer id);
	/**
	 * ����ְ�����֤��ɾ��ְ��
	 * @param idcard
	 * @return
	 */
	public boolean deleteEmployeeByIDCard(String idcard);
	/**
	 * ����ְ�������޸�ְ����Ϣ
	 * @param employee
	 * @param ename
	 * @return
	 */
	public boolean updateEmployeeByName(Employee employee , String ename);
	/**
	 * ����ְ������޸�ְ����Ϣ
	 * @param employee
	 * @param id
	 * @return
	 */
	public boolean updateEmployeeByID(Employee employee , Integer id);
	/**
	 * ����ְ�����֤���޸�ְ����Ϣ
	 * @param employee
	 * @param idcard
	 * @return
	 */
	public boolean updateEmployeeByIDCard(Employee employee , String idcard);
	public List<Employee> queryAllEmployee();
	/**
	 * ����ְ��������ѯְ��
	 * @param ename
	 * @return
	 */
	public Employee findEmployeeByName(String ename);
	/**
	 * ����ְ����Ų�ѯְ��
	 * @param id
	 * @return
	 */
	public Employee findEmployeeByID(Integer id);
	/**
	 * ����ְ�����֤�Ų�ѯְ��
	 * @param idcard
	 * @return
	 */
	public Employee findEmployeeByIDCard(String idcard);
}
