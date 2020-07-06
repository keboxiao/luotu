package com.chinatelecom.security;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.buzheng.demo.esm.dao.SysUserDao;
import org.buzheng.demo.esm.domain.SysUser;
import org.springframework.stereotype.Component;

@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {

	@Resource
	private SysUserDao sysUserDao;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		String username = String.valueOf(principals.getPrimaryPrincipal());

		// final User user = userService.selectByUsername(username);
		// final List<Role> roleInfos =
		// roleService.selectRolesByUserId(user.getId());
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("username", username);
		List<SysUser> list = sysUserDao.findPageByParams(params);
		authorizationInfo.addRole(list.get(0).getRoleId());
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = String.valueOf(token.getPrincipal());
		String password = new String((char[]) token.getCredentials());

		SysUser authentication = null;
		if (username != null) {
			authentication = new SysUser();
		}
		if (authentication == null) {
			throw new AuthenticationException("authentication error.");
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, getName());
		return authenticationInfo;
	}

}
