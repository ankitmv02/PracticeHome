package com.telusko.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}
