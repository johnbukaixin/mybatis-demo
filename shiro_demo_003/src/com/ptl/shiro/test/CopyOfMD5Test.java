package com.ptl.shiro.test;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

public class CopyOfMD5Test {
	// shiro提供了现成的加密类 Md5Hash
	@Test
	public void testMd5() {
//		String password_salt_2 = new Md5Hash("123456", "bjsxt", 2).toString();
		String password_salt_2 = new Md5Hash("123", "sq", 2).toString();
		System.out.println("散列2次：" + password_salt_2);
	}
}
