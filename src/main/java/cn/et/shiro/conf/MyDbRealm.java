package cn.et.shiro.conf;

import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.et.shiro.dao.UserMapper;
import cn.et.shiro.entity.UserInfo;

@Component
public class MyDbRealm extends AuthorizingRealm {
	@Autowired
	UserMapper userMapper;
	/**
	 * 认证
	 * 将登陆输入的用户名和密码和数据库中的用户名和密码对比 是否相等
	 * 返回值null表示失败 非null认证通过
	 * */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		//传入页面的token
		UsernamePasswordToken upt=(UsernamePasswordToken)token;
		UserInfo queryUser = userMapper.queryUser(upt.getUsername());
		if(queryUser!=null && queryUser.getPassword().equals(new String(upt.getPassword()))){
			SimpleAccount sa = new SimpleAccount(upt.getUsername(),upt.getPassword(),"MyDbRealm");
			return sa;
		}
		return null;
	}
	
	/**
	 * 获取当前用户的数据
	 * 将当前用户在数据库的角色和权限加载到AuthorizationInfo
	 * 默认在进行授权认证是调用
	 * 	检查权限调用  checkRole checkPerm
	 * */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		String userName=principals.getPrimaryPrincipal().toString();
		Set<String> roleSet=userMapper.queryRoleByName(userName);
		Set<String> permSet=userMapper.queryPermsByName(userName);
		//权限和角色的集合对象
		SimpleAuthorizationInfo authorizationInfo =new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(roleSet);
		authorizationInfo.setStringPermissions(permSet);
		return authorizationInfo;
	}	
}
