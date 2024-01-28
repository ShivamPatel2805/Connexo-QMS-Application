package com.example.security.Controller;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.security.model.User;

@SuppressWarnings("serial")
public class UserSecurityDetails implements UserDetails {

	private User user;

	public UserSecurityDetails(User user) {
		super();
		this.user = user;
	}

	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(new SimpleGrantedAuthority(user.getRoll()));
	}

	public Integer getId() {
		return user.getId();
	}

	public String getPassword() {
		return user.getPassword();
	}

	public String getUsername() {
		return user.getUseremail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
