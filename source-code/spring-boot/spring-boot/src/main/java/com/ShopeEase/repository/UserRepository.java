package com.ShopeEase.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ShopeEase.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
