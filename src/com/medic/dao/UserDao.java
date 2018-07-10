package com.medic.dao;

import java.util.List;

import com.medic.page.Pager;
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
	public User checkUserLogin(String userName , String password);
	
	/**
	 * 查询用户数量
	 * @return
	 */
	public Long getCountUser();
	
	/**
	 * 查询所有用户
	 * @param pager
	 * @return
	 */
	public List<User> queryAllUser(Pager pager);
	/**
	 * 注册用户
	 * @return
	 */
	public boolean addUser(User u);
	
	/**
	 * 删除用户
	 * @return
	 */
	public boolean deleteUser(String username);
	
	/**
	 * 修改用户
	 * @param id
	 * @return
	 */
	public boolean updateUser(User user ,int id);
}
