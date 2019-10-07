package com.ustglobal.dev.datamanager;

public class UserServiceImpl implements UserServices{

	public static void main(String[] args) {
		

	}
	
	UserInfo dao = new UserInfoImplementation();// created reference of userinfo interface and created objects of userinfoimplementation

	@Override
	public User getAllInfo() {
		
		return dao.getAllInfo();
	}

	@Override
	public void createProfile(User user) {
		
		dao.createProfile(user);
	}

}
