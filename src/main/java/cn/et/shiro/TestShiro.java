package cn.et.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class TestShiro {

	public static void main(String[] args) {
		//从ini中读取权限信息 构建SecurityManager对象
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:my.ini");
		org.apache.shiro.mgt.SecurityManager securityManager = (SecurityManager) factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		
		
		//获取当前用户
		Subject currentUser = SecurityUtils.getSubject();
		//当前用户的会话
		Session session = currentUser.getSession();
		//判断是否登录  未登录 才需要登录
		/**  
         * 用户包括两部分   
         *     principals and credentials  
         *     principals（本人）表示用户的标识信息 比如用户名 用户地址等  
         *     credentials（凭证）表示用户用于登录的凭证 比如密码 证书等  
         */   
		if ( !currentUser.isAuthenticated() ) {
			UsernamePasswordToken token = new UsernamePasswordToken("yce", "123456");
			token.setRememberMe(true);
			try {
				currentUser.login(token);
				if(currentUser.hasRole("role1")){
					System.out.println("用户1");
				}
				
				if(currentUser.isPermitted("user:delete:2")){
					System.out.println("有删除用户2的权限");
				}
				
			} catch ( UnknownAccountException uae ) {
			    System.out.println("账号错误");
			} catch ( IncorrectCredentialsException ice ) {
				 System.out.println("密码错误");
			} catch ( LockedAccountException lae ) {
				 System.out.println("账号被锁定");
			} catch ( AuthenticationException ae ) {
				 System.out.println("未知错误");
			}
			
		}
	}

}
