package com.jyt.soft.entiy;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.jyt.soft.entiy.common.CommonEntity;



@Entity
@Table(name="jyt_user")
public class UserBean extends CommonEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7443530416378261015L;

	private int userId;
	
	private String userName;
	
	private int userSex;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserSex() {
		return userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex + "]";
	}
	
	
}
