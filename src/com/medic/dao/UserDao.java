package com.medic.dao;

import com.medic.pojo.User;

/**
 * 用户接口
 * @author 苗欣
 *
 */
public interface UserDao {
	/**
	 * 检查登陆信息
	 * @param userName
	 * @param password
	 * @return
	 */
	public boolean checkUserLogin(String userName , String password);
	
	/**
	 * 注册用户
	 * @return
	 */
	public boolean addUser(User u);
	
	/**
	 * 删除用户
	 * @return
	 */
	public boolean deleteUser();
}
