package com.ptl.demo.test;

import java.util.List;


import com.ptl.demo.dao.UserDao;
import com.ptl.demo.proxy.MyProxy;

public class Test {

	public static void main(String[] args) {
		MyProxy myProxy=new MyProxy();
		UserDao userDao=(UserDao) myProxy.myProxy(UserDao.class);
		userDao.saveUser();
	}
}
