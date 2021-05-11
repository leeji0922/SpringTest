package org.soomgo.lji.domain;

public class UserVO {
	private String userName;
	private int userAge;
	private String userAddress;
	private String userId;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
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
	public UserVO(String userName, int userAge, String userAddress, String userId) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userAddress = userAddress;
		this.userId = userId;
	}
	public UserVO() {
		super();
	}
	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", userAge=" + userAge + ", userAddress=" + userAddress + ", userId="
				+ userId + "]";
	}
	
	
}
