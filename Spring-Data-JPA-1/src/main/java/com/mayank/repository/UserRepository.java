package com.mayank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mayank.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

//	public List<User> findByAge(Integer age);
//	
//	public List<User> findByCountry(String cname);
//	
//	public List<User> findByAgeAndCountry(Integer age, String country);
//	
//	public List<User> findByAgeGreaterThanEqual(Integer age);
//	
//	//public List<User> findByCountryAndCountry(String country, String country2);
//	
//	public List<User> findByCountryIn(List<String> countries);
	
	@Query(value="From User")
	public List<User> getAllUsersHQL();
	
	@Query(value = "select *from user" , nativeQuery = true)
	public List<User> getAllUsersSQL();
	
	@Query(value="From User where country =:cname")
	public List<User> getAllUsersByCountryHQL(String cname);
	
}
