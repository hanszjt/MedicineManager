package com.medic.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.medic.dao.UserDao;
import com.medic.dao.UserDaoImpl;
import com.medic.pojo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 
 * 验证用户名密码是否正确
 * @author 苗欣
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
 
	//登陆验证
	public String login() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String validateCode = request.getParameter("validateCode");
		String code = (String) ActionContext.getContext().getSession()
				.get("code");
		System.out.println("登录验证#########");
		String returnValue = "login";
		if (validateCode.equalsIgnoreCase(code)) {
			if (this.userDao.checkUserLogin(this.getUser().getUsername(), this
					.getUser().getPassword())) {
				returnValue = "success";
				ActionContext.getContext().getSession()
						.put("username", this.getUser().getUsername());
			} else {
				request.setAttribute("tip", "用户名或密码错误");

			}
		} else {
			request.setAttribute("tip", "验证码错误");
		}
		return returnValue;
	}

	//注册
	public String regist() {
		System.out.println("注册验证#########");
		System.out.println(this.user);
		this.userDao.addUser(this.user);
		return "success";
		
	}
}
