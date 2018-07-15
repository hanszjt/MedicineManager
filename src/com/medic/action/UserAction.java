package com.medic.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.medic.dao.UserDao;
import com.medic.dao.impl.UserDaoImpl;
import com.medic.page.Pager;
import com.medic.pojo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.medic.page.PagerHelper;
/**
 * 
 * �û��
 * @author ����
 *
 */
public class UserAction extends ActionSupport{
	private UserDao userDao = new UserDaoImpl();
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
 
	//��½��֤
	public String login() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String validateCode = request.getParameter("validateCode");
		String code = (String) ActionContext.getContext().getSession()
				.get("code");
		System.out.println("��¼��֤#########");
		String returnValue = "login";
		if (validateCode.equalsIgnoreCase(code)) {
			User checkUser = this.userDao.checkUserLogin(this.getUser().getUsername(), this.getUser().getPassword());
			System.out.println(checkUser.getPermission() + "111111111111111111");
			if (checkUser != null) {
				switch (checkUser.getPermission()) {
				case 0:
					returnValue = "supermanager";
					break;
				case 1:
					returnValue = "salemanager";
					break;
				case 2:
					returnValue = "goodsmanager";
					break;
				}
				
				ActionContext.getContext().getSession()
						.put("username", this.getUser().getUsername());
			} else {
				request.setAttribute("tip", "�û������������");

			}
		} else {
			request.setAttribute("tip", "��֤�����");
		}
		return returnValue;
	}

	//ע��
	public String regist() {
		System.out.println("ע����֤#########");
		System.out.println(this.user);
		this.userDao.addUser(this.user);
		return "success";		
	}
	
	//�û���ҳ��ʾ
	public String listAllUserPager(){
		long totalRows = 0;
		Pager pager = null;
		int pageSize = 10;
		HttpServletRequest request = ServletActionContext.getRequest();
		totalRows = userDao.getCountUser();
		pager = PagerHelper.getPager(request, (int)totalRows, pageSize);
		pager.setLinkUrl("listAllPage.action"); // ������ת·����Ҳ�����ǣ�&
		request.setAttribute("total", totalRows);
		request.setAttribute("pb", pager); // ����ҳ��Ϣ������Request����pb��
		List<User> studentList = userDao.queryAllUser(pager);
		request.setAttribute("userList", studentList);
		return SUCCESS;
	}
	
	public String delete(){
		int id = this.user.getId();
		userDao.deleteUserById(id);
		return SUCCESS;
		
	}
	
	public String adduser(){
		System.out.println(this.user);
		this.userDao.addUser(this.user);
		return null;
	}
	
	public String update(){
		userDao.updateUser(this.getUser(), this.user.getId());
		return SUCCESS;
	}
	
	public String findUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		List<User> queryUserByName = userDao.queryUserByName(this.user.getUsername());
		request.setAttribute("userList", queryUserByName);
		return SUCCESS;
	}
	
	public String updateRole(){
		Integer permission = this.user.getPermission();
		this.user = userDao.queryUserByName(this.user.getUsername()).get(0);
		user.setPermission(permission);
		userDao.updateUser(this.user, this.user.getId());
		return SUCCESS;
	}
}
