package com.simplilearn.demo.repo;

import com.simplilearn.demo.entity.User;
import com.simplilearn.demo.movies.Movies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>  {
	
	public User findByName(String name);
}
