package com.simplilearn.demo.movies;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;


@Repository
public interface MoviesRepo extends JpaRepository<Movies,Integer>{

	
	
	public Movies findByName(String name);

}
