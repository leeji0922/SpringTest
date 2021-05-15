package org.soomgo.lji.domain;

public class FindUserVO {
	private String name;
	private String id;
	private String password;
	private String age;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public FindUserVO(String name, String id, String password, String age, String address) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
		this.address = address;
	}
	public FindUserVO() {
		super();
	}
	@Override
	public String toString() {
		return "FindUserVO [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + ", address="
				+ address + "]";
	}
}
