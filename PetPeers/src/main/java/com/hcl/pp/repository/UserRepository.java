package com.hcl.pp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.pp.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserNameAndUserPassword(String userName, String userPassword);

	User findByUserName(String userName);

	Optional<User> findById(Long userId);
}
