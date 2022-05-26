package com.vo;

public class UserVo {

	private String id;
	private String pwd;
	private String name;
	
	// Constructors
	public UserVo() {
	}
	
	public UserVo(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	// Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	
	
}
