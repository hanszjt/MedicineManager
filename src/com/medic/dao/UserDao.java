package com.medic.dao;

import java.util.List;

import com.medic.page.Pager;
import com.medic.pojo.User;

/**
 * �û��ӿ�
 * @author ����
 *
 */
public interface UserDao {
	/**
	 * ����½��Ϣ
	 * @param userName
	 * @param password
	 * @return
	 */
	public User checkUserLogin(String userName , String password);
	
	/**
	 * ��ѯ�û�����
	 * @return
	 */
	public Long getCountUser();
	
	/**
	 * ��ѯ�����û�
	 * @param pager
	 * @return
	 */
	public List<User> queryAllUser(Pager pager);
	/**
	 * ע���û�
	 * @return
	 */
	public boolean addUser(User u);
	
	/**
	 * ɾ���û�
	 * @return
	 */
	public boolean deleteUser(String username);
	
	/**
	 * �޸��û�
	 * @param id
	 * @return
	 */
	public boolean updateUser(User user ,int id);
}
