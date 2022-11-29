package com.jpa.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.test.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String city);

	@Query("select u from User u")
	public List<User> getAllUser();

	@Query("select u from User u where u.name=:n")
	public List<User> getUserByName(@Param("n") String name); // @parmeter is binded or binding to param

	@Query("select u from User u where u.name=:n and u.city=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);

	@Query("Select u from User u where u.city=:c")
	public List<User> getUserByCity(@Param("c") String city);

	// native Query

	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getUsers();

}
