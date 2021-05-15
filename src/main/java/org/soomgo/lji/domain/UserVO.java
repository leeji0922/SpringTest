package org.soomgo.lji.domain;

public class UserVO {
	private String userName;
	private String userAge;
	private String userAddress;
	private String userId;
	private String userPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public UserVO(String userName, String userAge, String userAddress, String userId, String userPassword) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userAddress = userAddress;
		this.userId = userId;
		this.userPassword = userPassword;
	}
	public UserVO() {
		super();
	}
	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", userAge=" + userAge + ", userAddress=" + userAddress + ", userId="
				+ userId + ", userPassword=" + userPassword + "]";
	}
	
	
	
	
}
