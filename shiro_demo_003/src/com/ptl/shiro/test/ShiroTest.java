package com.ptl.shiro.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class ShiroTest {
	// 用户登录和退出
	@Test
	public void testAuthenticator() {
		// 构建SecurityManager工厂，IniSecurityManagerFactory可以从ini文件中初始化SecurityManager环境
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory(
				"classpath:shiro.ini");
		// 通过工厂获得SecurityManager实例
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		// 将securityManager设置到运行环境中
		SecurityUtils.setSecurityManager(securityManager);
		// 获取subject实例
		Subject subject = SecurityUtils.getSubject();
		// 创建用户名,密码身份验证Token
		//zhaoliu   123456
		UsernamePasswordToken token = new UsernamePasswordToken("sunqi", "1233");
		try {
			// 登录，即身份验证
			subject.login(token);
			
			//获取shiro的会话对象
//			Session session = subject.getSession();
			//授权
//			subject.checkPermission(arg0);
//			subject.checkRole(arg0);
			
		} catch (AuthenticationException e) {
			System.out.println(e.getClass().getCanonicalName());
			if (e instanceof IncorrectCredentialsException) {
				System.out.println("密码错误");
			} else if (e instanceof UnknownAccountException) {
				System.out.println("账号不存在");
			}
//			e.printStackTrace();
			// 身份认证失败
		}
		// 断言用户已经登录
		Assert.assertEquals(true, subject.isAuthenticated());
		// 退出
		subject.logout();
	}
}
