package com.jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
