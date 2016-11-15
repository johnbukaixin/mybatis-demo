package com.ptl.shiro.test.realm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class UserRealm extends AuthorizingRealm {
	@Override
	public String getName() {
		return "UserRealm";
	}

	// 获取正确的认证信息的方法
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		//根据用户输入的身份信息，到数据库获取正确的信息
		//如果能够根据用户的身份信息查询到数据，则将正确的用户信息数据返回给安全管理器
		//由安全管理器来判断是否通过认证
		
		//如果根据用户的身份信息不能够查询到用户的信息，则返回null，此时安全管理器的判断是
		//org.apache.shiro.authc.UnknownAccountException
		//没有当前账号信息
		String username = (String) token.getPrincipal();
		String pwd = null;
		String salt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shiro?useUnicode=true&amp;characterEncoding=utf8";
			String user = "root";
			String password = "123456";
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement("select * from tb_user where user_name=?");
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			
			pwd = null;
			
			if (rs.next()) {
				pwd = rs.getString(3);
				salt = rs.getString(4);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (null == pwd) {
			return null;
		} else {
			//此时返回的是正确的信息，我们并不在realm中自行判断
			return new SimpleAuthenticationInfo(username, pwd, ByteSource.Util.bytes(salt), getName());
		}
	}

	// 用于授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		return null;
	}
}
