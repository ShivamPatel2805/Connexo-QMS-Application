package com.example.security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.security.dao.UserDAO;
import com.example.security.model.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDAO userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.getUserByEmailId(username);
		System.out.println("user from DB name is "+user.getUseremail() +"nd password is "+user.getPassword());
		if(user == null) {
			System.out.println("user not found");
		}
		return new UserSecurityDetails(user);
	}

}
