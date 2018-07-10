package com.medic.pojo;

/**
 * 用户表实例
 * @author 苗欣
 *
 */
public class User {
	private Integer id;
	private String username;
	private String password;
	private Integer permission;
	
	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getPermission() {
		return permission;
	}


	public void setPermission(Integer permission) {
		this.permission = permission;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", permission=" + permission
				+ "]";
	}
	
	
	
	
	
	
	
	
}
