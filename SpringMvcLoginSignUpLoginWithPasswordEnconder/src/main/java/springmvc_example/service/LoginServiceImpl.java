package springmvc_example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import springmvc_example.dao.LoginDao;
import springmvc_example.model.UserInfo;

public class LoginServiceImpl implements UserDetailsService{
	
	LoginDao loginDao;

	
    @Autowired
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}



	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	UserInfo userinfo = loginDao.findUserInfo(username);
		
		if(userinfo ==null) {
			throw new UsernameNotFoundException("Usuaário  não encontrado na base!");
		}
		
		List<String> roles = loginDao.getUserRoles(username);
		
		List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
		
		if(roles != null) {
			for(String role : roles) {
				GrantedAuthority authority = new SimpleGrantedAuthority(role);
				grantList.add(authority);
			}
		}
		UserDetails userDetails =  new User(userinfo.getUsername(), userinfo.getPassword(), grantList);
		return userDetails;
	}

}
