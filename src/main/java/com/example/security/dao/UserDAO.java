package com.example.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.security.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
	
//	@Query(value = "select * from User u where u.useremail =:emailId and u.password =:password", nativeQuery = true)
//	public User getUserByEmailIdAndPassword(@Param("emailId") String emailId,  @Param("password") String password);

	@Query(value = "select * from User u where u.useremail =:emailId", nativeQuery = true)
	public User getUserByEmailId(@Param("emailId") String emailId);
}
